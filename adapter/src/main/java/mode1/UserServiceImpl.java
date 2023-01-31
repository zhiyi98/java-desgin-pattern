package mode1;

import java.util.*;

public class UserServiceImpl implements UserService {
    public Map findById(){
        Map map = new LinkedHashMap();
        map.put("user_id", 1234);
        map.put("username", "zhangsan");
        return map;
    }

    public List<Map> findUsers(){
        List<Map> list = new ArrayList<>();
        for(int i = 0 ; i<=10 ; i++){
            Map map = new LinkedHashMap();
            map.put("user_id", new Random().nextInt(100000));
            map.put("username", "user"+i);
            list.add(map);
        }
        return list;
    }
}
