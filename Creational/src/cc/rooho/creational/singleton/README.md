# **Singleton**

## **Hungry of Singleton**(SingletonHungry.java)
    饥饿模式，只要类被初始化，静态类变量就会被初始化。好处是没有线程安全的问题，缺点是把单例对象的初始化耦合在了静态区初始化上，静态初始化会消耗更多的资源。

## **Lazy of Singleton** (SingletonLazy.java)
    懒加载模式，第一次使用此单例对象时候才会被初始化，此例子采用了“双重检查”的方法，保证线程安全。

## **Lazy init holder class of Singleton** (SingletonLazyHolderClass.java)
    这个模式综合使用了Java的类级内部类和多线程缺省同步锁的知识，很巧妙地同时实现了延迟加载和线程安全。

## **Enum of Singleton** (SingletonEnum.java)
    使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。

## **Registry of Singleton**(SingletonRegistry.java)
    通常需要管理一批不同类而又需要单例的对象时候使用。我们通过 SingletonRegistry 这个类来维持一个对象注册 map ，如果注册表中已有对象则直接取回，依此来保证 SingletonRegistry 所取回的对象都是单例。