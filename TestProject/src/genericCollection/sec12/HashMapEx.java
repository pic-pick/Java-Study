import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 저장: put(key, value)
        map.put("홍길동", 90);
        map.put("이몽룡", 80);
        map.put("성춘향", 95);
        map.put("홍길동", 85); // key 중복 -> 새로 추가되지 않고 value만 update

        System.out.println("총 객체수 : " + map.size());

        // key에 해당되는 value 반환 : get(key)
        System.out.println("홍길동 점수 : " + map.get("홍길동"));

        // 전체객체 순회 1 : keySet()
        System.out.println("---------------------------------");
        for (String k : map.keySet()) {
            System.out.println(k + " : " + map.get(k));
        }

        // 전체객체 순회 2 : forEach(BiConsumer)
        System.out.println("---------------------------------");
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        // 전체객체 순회 3 : entrySet()
        System.out.println("---------------------------------");
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 자주 쓰는 유틸 메서드들
        System.out.println("---------------------------------");
        System.out.println("containsKey(\"성춘향\") = " + map.containsKey("성춘향"));
        System.out.println("containsValue(100) = " + map.containsValue(100));
        System.out.println("isEmpty() = " + map.isEmpty());

        // getOrDefault / putIfAbsent / replace / remove 예시
        System.out.println("getOrDefault(\"임꺽정\", -1) = " + map.getOrDefault("임꺽정", -1));
        map.putIfAbsent("임꺽정", 70); // 없을 때만 넣기
        map.replace("이몽룡", 88);     // 존재할 때만 교체
        map.remove("홍길동");          // key 삭제

        System.out.println("---------------------------------");
        System.out.println("최종 map = " + map); // toString()으로 전체 출력
    }
}