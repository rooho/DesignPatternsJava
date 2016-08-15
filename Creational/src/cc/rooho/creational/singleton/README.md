# **[Singleton](https://www.wikiwand.com/en/Singleton_pattern#/The_Enum-way)**


### Hungry of Singleton   
饥饿模式，只要类被初始化，静态类变量就会被初始化。好处是没有线程安全的问题，缺点是把单例对象的初始化耦合在了静态区初始化上，静态初始化会消耗更多的资源。

[SingletonHungry.java](SingletonHungry.java)

### Lazy of Singleton 
懒加载模式，第一次使用此单例对象时候才会被初始化，此例子采用了“双重检查”的方法，保证线程安全。(java 5 之前这种双重检查任然会返回多个对象，因为 Java 平台内存模型允许所谓的“无序写入”。)

[SingletonLazy.java](SingletonLazy.java)

### Lazy init holder class of Singleton
这个模式综合使用了Java的类级内部类和多线程缺省同步锁的知识，很巧妙地同时实现了延迟加载和线程安全。
当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，导致静态内部类 SingletonHolder 得到初始化；而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建 SingletonLazyHolderClass 的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。

[SingletonLazyHolderClass.java](SingletonLazyHolderClass.java)

### Enum of Singleton
使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。

[SingletonEnum.java](SingletonEnum.java)
