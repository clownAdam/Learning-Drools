## 规则引擎模块
    实现规则，验收规则，生成jar包
##### 1.Fact对象
    Fact是指在Drools规则应用当中，将一个普通的JavaBean对象插入到规则的WorkingMemory(内存存储)当中后的对象。
    规则可以对Fact对象进行任意的读写操作，当一个JavaBean插入到内存存储当中变成Fact之后，Fact对象不是对原来的JavaBean对象进行克隆，而是原来JavaBean对象的引用。
    规则进行计算的时候需要用到应用系统当中的数据，这些数据设置在Fact对象当中，然后将其插入到规则的内存存储中。
    一个Fact对象通常是一个具有getter和setter方法的pojo对象，通过getter和setter方法可以方便的对Fact对象进行操作。
    所以我们可以简单的把Fact对象理解为规则与应用系统数据交互的桥梁或通道
    当Fact对象插入到内存存储当中后，会与当前内存存储当中所有的规则进行匹配，同时返回一个FactHandler对象。
    FactHandler对象是插入到内存存储当中Fact对象的引用句柄，通过FactHandler对象可以实现对对应的Fact对象通过API警醒删除及修改等操作。

##### 2.Drools语法
    1、包路径
    2、引用
    3、规则体