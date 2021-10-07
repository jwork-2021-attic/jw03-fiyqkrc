# 作业三

*学号:181860072 姓名:彭建涛*

## 任务一:代码工作原理

### 加密原理:

- 对需要加密的文件进行编译得到字节码
- 加密模块对字节码进行加密:
- 将字节码文件读入内存,以字节形式存储在字节数组里;
- 对文件名,文件名长度,文件长度也编码进字节数组中,并同文件字符数组连成一个大的字节数组;
- 开始对得到的字节数组加密;
- 将图片读入内存,得到图片的rgb数据的int型数组;
- 对于每个int类型的RGB数据,取其中的0-1,8-9,16-17六个bit的位置来存储字节数组的数据,直到所有数据被写进RGB数组里;
- 将得到的RGB数组写进image文件;

### 解密原理:

- 读入加密后的image文件;

- 得到RGB数组;

- 对于每个int类型的RGB数据,取出其中的0-1,8-9,16-17六个bit的位置的数据,每8个bit组成一字节的数据;

- 直到整个数组被解析完成(优化方法:先取8个字节的 数据可以算出filename和file的大小,再计算还需要取出多少的数据)

- 对得到的数据进行分割得到filename,字节码,filesize等数据.

## 任务二

图片URL:

[选择排序](https://github.com/jwork-2021/jw03-fiyqkrc/blob/main/S181860072.SelectSorter.png)

[快速排序](https://github.com/jwork-2021/jw03-fiyqkrc/blob/main/S181860072.QuickSorter.png)

## 任务三

- [选择排序](https://asciinema.org/a/MQFySD3XKZYGvQcRvBJtbWVq9 )

  [![asciicast](https://asciinema.org/a/MQFySD3XKZYGvQcRvBJtbWVq9.svg)](https://asciinema.org/a/MQFySD3XKZYGvQcRvBJtbWVq9)

- [快速排序](https://asciinema.org/a/gtor4tiXfUz2bzIE4XjVqoL9U)

  [![asciicast](https://asciinema.org/a/gtor4tiXfUz2bzIE4XjVqoL9U.svg)](https://asciinema.org/a/gtor4tiXfUz2bzIE4XjVqoL9U)

## 任务四

感谢vectormoon同学提供的插入算法例图:

结果链接:

[![asciicast](https://asciinema.org/a/8DC2LCTZJ3lMQViueGpxz8prp.svg)](https://asciinema.org/a/8DC2LCTZJ3lMQViueGpxz8prp)

