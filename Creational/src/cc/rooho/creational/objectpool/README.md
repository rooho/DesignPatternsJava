# **[Object Pool Pattern](https://www.wikiwand.com/en/Object_pool_pattern)**

对象池使用的基本思路是：将用过的对象保存起来，等下一次需要这种对象的时候，再拿出来重复使用，从而在一定程度上减少频繁创建对象所造成的开销。 并非所有对象都适合拿来池化――因为维护对象池也要造成一定开销。对生成时开销不大的对象进行池化，反而可能会出现“维护对象池的开销”大于“生成新对象的开销”，从而使性能降低的情况。但是对于生成时开销可观的对象，池化技术就是提高性能的有效策略了。

```java
public class Main {
    public static void main(String[] args) {
        System.out.printf("creational!");

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection

        // Return the connection:
        pool.checkIn(con);
    }
}
```