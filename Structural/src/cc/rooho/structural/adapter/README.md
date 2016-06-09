# **Adapter Model **(包装器 Wrapper)
---
>将一个类的接口转换为客户希望的另一个接口，适配器模式使得原本由于接口不兼容而不能一起工作的类可以一起工作。

**实现方法：**
将原有的类包含在另一个类中，让包含的类与需要的接口匹配，调用被包含类的方法。

原有类 HHashMap 并不适应新的接口 ISet 的要求，但是又不允许改变其方法名称或派生 HHashMap。这样我们创建一个新类 HHashSet 来实现 ISet 接口，并持有一个 HHashMap 对象来实现代码。

![image](https://github.com/rooho/DesignPatternsJava/uml/adapter_uml.png)