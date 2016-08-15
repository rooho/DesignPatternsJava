# **[Multiton Pattern](https://www.wikiwand.com/en/Multiton_pattern)**

### Multiton
当程序需要管理一批不同类而又需要单例的对象时候可以使用注册单例模式。我们通过 SingletonRegistry 这个类来维持一个对象注册 map ，如果注册表中已有对象则直接取回，依此来保证 SingletonRegistry 所取回的对象都是单例。
[Multiton.java](Multiton.java)


















