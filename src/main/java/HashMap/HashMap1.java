package HashMap;


import java.util.*;

public class HashMap1 {
    public static void main(String[] args) {


        /*
        | employee_id | first_name | last_name | salary |
        | 100         | Steven     | King      | 24000  |
        | 101         | Need       | Kochhar   | 17000  |
        | 102         |

         */

        List<Map<String, Object>> table = new ArrayList();


        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("employee_id", 100);
        map1.put("employee_id", "Steven");
        map1.put("first_name", "King");
        map1.put("salary", 24000);


        Map<String, Object> map2 = new HashMap<String, Object>();
        map1.put("employee_id", 101);
        map1.put("employee_id", "Neen");
        map1.put("first_name", "Kochhar");
        map1.put("salary", 17000);

        Map<String, Object> map3 = new HashMap<String, Object>();
        map1.put("employee_id", 102);
        map1.put("employee_id", "Lex");
        map1.put("first_name", "De Haan");
        map1.put("salary", 17000);

        table.add(map1);
        table.add(map2);
        table.add(map3);

    }
}
