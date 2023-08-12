### 输入

```python
import sys
for line in sys.stdin:
    group = list(map(int, line.split())) # 将 line 字符串中每个数字以 int 类型放在 list
  
```

### 输出

保留两位小数
```python
a = 12.246
print("%.2f" % a)   # 结果 12.24

print(round(a, 2))  # 结果 12.25，四舍五入

import math
print(int(-a))         # 结果 -12，截断
print(math.floor(-a))  # 结果 -13，floor 是取小值，不能指定位数
print(math.floor)      # 结果 12

```
