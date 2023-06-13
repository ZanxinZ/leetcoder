# python 常用语法

## 集合 Set

```python
# create and access
s = set()
s.add(2)
s.add(1)
s.remove(1)
a = 2
if a in s: 
  s.remove(a)
for item in s:
	print(item)
  
length = len(s) #取长度

# Join
set1 = {"a", "b", 1}
set2 = {1, 3}
set3 = set1.union(set2)  # return a new set with all item from set1 and set2

set1.update(set2)        # insert the items in set2 into set1.

# operation

set1.clear()
setCom = set1.intersection(set2)  # return a set that is the intersection of two sets.
setdiff = set1.intersection(set2) # return a set that containing difference between two or more sets.
```

## 字符

```python
# char to int
print(ord("a")) // 97

# int to char
print(chr(97))
```

## 创建空列表 list

```swift
arr = [0] * 10 // one dimension array [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

arr = [ [0] * 10 for i in range(0, 5)]  // 5 row, 10 column, array

arr = [ [False for _ in range(0, 5)] for _ in range(0, 10)]
```

## 数值

```python
maxValue = sys.maxsize
minValue = -sys.maxsize - 1
```

## 列表的插入与删除

```python
q = []
q.append(5)
q.append(6)
q.append(4)

q.remove(4)  // remove element 4
q.pop(0)     // pop the first element
```

## 字典的插入与删除

```python
# 以字符串形式存 key-value
d = dict()

d["amy"] = "23"  # 存

s = d.get("amy") # 取

# 判断是否在字典中
if "amy" in d:
  d.pop("amy")   # 删除键值对，并且返回值
```


## 字符串

字符串与 list 转换
```python
# 字符串 s 转为 list
oneList = list(s)  

# list 合并为字符串 s
s = ''.join(onList)

# to lower case
s = s.lower()
```

## 数字操作
```python 
a = round(3.5) # 4 四舍五入
b = cell(3.5)  # 4
c = floor(3.5) # 3
```

## 随机数
```python
import random
import datetime
random.seed(datetime.datetime.now())
ran = random.randint(0, 5) # 随机一个数字 ran，且 0 <= ran <= 5

group = [2, 5, 6]
r = random.choice(group) # 从数组随机选一个
```

## 二进制
```python
b = bin(4)		# 结果为 0b1000
s = str(bin(4))[2:]	# 只取后面数字的部分
```
