package chunming.liu.dubbo.api;

import java.util.List;
import java.util.Map;

public interface IDubboService {
    public Map<String, List> getPermissins(String id, int count);

}
