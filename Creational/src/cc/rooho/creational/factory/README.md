# **[Factory Pattern](https://www.wikiwand.com/en/Factory_method_pattern)**

## **简单工厂模式（Simple Factory Pattern）又叫静态工厂方法模式（Static FactoryMethod Pattern）**

简单工厂模式（Simple Factory Pattern）属于类的创新型模式，又叫静态工厂方法模式（Static FactoryMethod Pattern）,是通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
### 优点
由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；它所能创建的类只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了。
### 缺点
工厂类负责创建的对象比较少；客户只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心；由于简单工厂很容易违反高内聚责任分配原则，因此一般只在很简单的情况下应用。

## **工厂方法模式（Factory Method Pattern）**

### 使用时机会
* 对象的创建如果需要代码复用却没有现成的代码可用时，工厂方法设计模式就派上用场了。
* 类并不知道需要创建的是什么子类。
* 子类可以指定应该创建什么样的对象。
* 父类会委托它的子类创建对象。

### 优点
代码灵活，松耦合和可复用性，将对象创建的代码从客户端移到了工厂类，那就是它的子类。这非常易于维护相关代码，因为对象的创建非常集中。

## **抽象工厂模式（Abstract Factory Pattern）**

### 抽象工厂模式与工厂方法模式的区别
抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。他与工厂方法模式的区别就在于，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则是针对的多个产品等级结构。在编程中，通常一个产品结构，表现为一个接口或者抽象类，也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类。

<img src="/uml/abstract_factory_uml.png" alt="abstract factory uml model" />

## **总结**

* 简单工厂 ： 用来生产同一等级结构中的任意产品。（对于增加新的产品，无能为力）
* 工厂方法 ：用来生产同一等级结构中的固定产品。（支持增加任意产品）
* 抽象工厂 ：用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族）