### HashMap

属于散列表，存储 key-value 映射。

最多允许一条记录为 null, 不支持线程同步。

继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

boolean equals(Object obj)//比较指定对象与本映射是否相等

- 生成对象

  ```java
  import java.util.HashMap;
  HashMap<Integer, String> myMap = new HashMap<Integer, String>();
  ```

- 添加键值对

  ```java
  myMap.put(1,"Monday");
  myMap.put(3,"Wednesdy");
  myMap.put(4,"Tuesday");
  ```

- 获取值（通过key）

  ```java
  myMap.get(3);//返回对应的值，不存在则返回 null
  ```

- 移除键值对(通过key)

  ```java
  myMap.remove(1);
  ```

- 判断是否包含键

  ```java
  myMap.containsKey(4)
  ```

- 判断是否包含值

  ```java
  myMap.containsValue("Wedenesday");
  ```

- 判断是否为空

  ```java
  myMap.isEmpty();
  ```

- 总的键值对个数

  ```java
  myMap.size()
  ```



- foreach 对每个映射执行指定的操作

  ```java
  myMap.forEach(BiConsumer<K, V> action)
  ```

  例如使用lambda表达式：

  ```java
  myMap.forEach((key,value)->{
  	value = value + 10;
  	System.out.println(key +" "+ value );
  })
  ```

  

