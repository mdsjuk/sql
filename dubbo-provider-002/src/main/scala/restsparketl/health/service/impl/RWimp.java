package restsparketl.health.service.impl;

import com.dubbo.service.RW;
import com.uber.engsec.dp.examples.QueryRewritingExample;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author:wxb
 * @description:
 * @date:19:372020/9/19
 */
@Service
@Component
public class RWimp implements RW {
    @Override
    public String RW() {
        return  QueryRewritingExample.elasticSensitivityExample();
    }
}
