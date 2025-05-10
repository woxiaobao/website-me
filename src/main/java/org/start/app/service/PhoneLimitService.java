package org.start.app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 手机号限流服务
 * 用于限制同一手机号在一天内的使用次数
 */
@Slf4j
@Service
public class PhoneLimitService {

    /**
     * 存储手机号使用记录的Map
     * key: 手机号+日期，value: 使用次数
     */
    private final Map<String, Integer> phoneUsageMap = new ConcurrentHashMap<>();

    /**
     * 每日最大使用次数限制
     */
    private static final int MAX_DAILY_USAGE = 10;

    /**
     * 检查手机号是否超过使用限制
     *
     * @param phone 手机号
     * @return true-未超过限制，可以使用；false-已超过限制，不能使用
     */
    public boolean checkPhoneLimit(String phone) {
        String key = generateKey(phone);
        Integer count = phoneUsageMap.getOrDefault(key, 0);

        if (count >= MAX_DAILY_USAGE) {
            log.warn("手机号[{}]今日使用次数已达上限：{}", phone, MAX_DAILY_USAGE);
            return false;
        }

        return true;
    }

    /**
     * 增加手机号使用次数
     *
     * @param phone 手机号
     * @return 增加后的使用次数
     */
    public int incrementPhoneUsage(String phone) {
        String key = generateKey(phone);
        int newCount = phoneUsageMap.getOrDefault(key, 0) + 1;
        phoneUsageMap.put(key, newCount);
        log.info("手机号[{}]今日使用次数：{}", phone, newCount);
        return newCount;
    }

    /**
     * 生成Map的key
     *
     * @param phone 手机号
     * @return 格式为：手机号_日期 的key
     */
    private String generateKey(String phone) {
        LocalDate today = LocalDate.now();
        return phone + "_" + today;
    }

    /**
     * 获取手机号当日已使用次数
     *
     * @param phone 手机号
     * @return 使用次数
     */
    public int getPhoneUsageCount(String phone) {
        String key = generateKey(phone);
        return phoneUsageMap.getOrDefault(key, 0);
    }
}