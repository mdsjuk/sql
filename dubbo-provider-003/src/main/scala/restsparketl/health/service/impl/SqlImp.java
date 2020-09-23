package restsparketl.health.service.impl;

import com.dubbo.service.DP_noise;
import com.uber.engsec.dp.examples.ElasticSensitivityExample;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author:wxb
 * @description:
 * @date:19:052020/9/19
 */
@Service
@Component
public class SqlImp implements DP_noise {
    @Override
    public String noise() {
        return "噪声添加=="+ ElasticSensitivityExample.laplacenoise();
    }
}


