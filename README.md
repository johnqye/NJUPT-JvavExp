# 南邮Java实验报告

## 比较现实的运行方式

比较现实的是先自己写，如果碰到问题，*用记事本而不是IDE(`Eclipse`)*打开对应文件复制粘贴  
文件分两部分，`src`和`test`  

比如实验2的问题3不会做或需要思路，那么记事本打开

`src/Exp2/Problem3/*.java`  
`test/Exp2/Problem3/*.java`

另外抄报告也是一种好方法\[斜眼笑\]

## 比较科幻的运行方式

以实验2问题1为例：

```sh
javac -d classes/ src/*/*/*.java
javac -d classes/ -cp classes test/*/*/*.java
java -cp classes/ Exp2.Problem1.Test
```
