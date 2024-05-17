---
title: Spring doc2
---
<SwmSnippet path="/javaAlgorithms/src/main/java/com/javaApp/javaAlgorithms/PrintArrayListsameNumberPairsCount.java" line="13">

---

This method prints the same number of pairs into the list :<SwmToken path="/javaAlgorithms/src/main/java/com/javaApp/javaAlgorithms/PrintArrayListsameNumberPairsCount.java" pos="9:4:4" line-data="public class PrintArrayListsameNumberPairsCount {">`PrintArrayListsameNumberPairsCount`</SwmToken>

```java
        String normalString = "@123Helloworld@563";
        System.out.println("The reversed string is: " + normalString);


        List<Integer> list = Arrays.asList(4, 7, 3, 4, 9, 4, 3, 3, 3, 5, 5);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);

            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                count++;
            }
        }
        System.out.println("The number of same number pairs is: " + count);
    }
```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBSmF2YSUzQSUzQW5hcmVuZHJhYjE1" repo-name="Java"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>
