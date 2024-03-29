## 与静态代理模式比较
```text
代码几乎一致，但是两者目的不同，装饰者模式是以对客户端透明的方式扩展对象的功能，是继承关系的一种替代方案；
代理模式则是给对象提供一个代理对象，并由代理对象来控制原有对象的引用。
装饰者模式为本装饰的对象进行功能扩展；代理模式对代理对象进行控制，但不做功能扩展

优点：
装饰者模式与继承关系的目的都是要扩展对象的功能，但是装饰者模式可以提供比继承更多的灵活性。
通过使用不同的具体装饰类以及这些装饰类的排列组合，设计师可以创造出很多不同行为的组合。

缺点：
这种比继承更加灵活机动的特性，也同时意味着更加多的复杂性。
装饰模式会导致设计中出现许多小类，如果过度使用，会使程序变得很复杂。
装饰模式是针对抽象组件（Component）类型编程。但是，如果你要针对具体组件编程时，就应该重新思考你的应用架构，以及装饰者是否合适。当然也可以改变Component接口，增加新的公开的行为，实现“半透明”的装饰者模式。在实际项目中要做出最佳选择。
```