package org.rpc.docker;

import com.google.gson.Gson;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class CacheUtils implements InitializingBean {
    @Autowired
    StringRedisTemplate redisTemplate;

    private HashOperations<String, Object, Object> ops;

    public  void setCache(String type, String key, Object value) {
        ops.put(type,key,new Gson().toJson(value));
    }

    public <T> T getCache(String type, String key, Class<T> typeClass) {
        if (ops.hasKey(type,key))
            return new Gson().fromJson((String) ops.get(type,key),typeClass);
        else
            return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ops = redisTemplate.opsForHash();
    }
}
