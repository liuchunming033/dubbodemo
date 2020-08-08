package chunming.liu.dubbo.provider;

import chunming.liu.dubbo.api.IDubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DubboServiceImpl implements IDubboService {
    private Logger log = LoggerFactory.getLogger(DubboServiceImpl.class);
    public Map<String, List> getPermissins(String id, int count) {
        List<String> demo = new ArrayList<>();
        Map<String,List> response = new HashMap<>();
        log.info("id:{}  and count:{}", id, count);
        for (int i = 0; i < count; i++) {
            demo.add(String.format("Permission_%s", id + i));
        }
        response.put("permissions",demo);

        return response;
    }
}
