
## Architecture

包结构介绍：

```txt
└── org
    └── domain
        └── smart
            ├── core # smart domain 的核心包，将来可能独立成库
            │ └── domain # 服务于应用的 domain 层
            │     ├── concept # 标记实体及关系的标记接口
            │     └── query # 查询相关的工具类
            │         └── specification # Specification 的抽象定义
            ├── extention # smart domain的扩展包，将来可能独立成库
            │ ├── adapter # 服务于应用的 adapter 层
            │ │ └── annotation # 可能会创建出自己的 annotation ，用于标记 Controller 等。
            │ └── persistent # 服务于应用的 persistent 层
            │     └── mybatis
            │         ├── query # 查询相关的工具类的 Mybatis 实现
            │         │ └── specification # Specification 的 Mybatis 实现
            │         └── support # Mybatis 实现的基础支撑代码
            └── generator # smart domain的生成器，将来可能独立成库
                ├── adapter # 用于生成 adapter 层，会根据Spring MVC、Jersey生成不同的代码
                ├── domain # 用于生成 domain 层，会根据ER图生成domain代码
                └── persistent # 用于生成 persistent 层，也会根据ER图生成，同时根据Mybatis和Spring Data生成不同的代码

```

