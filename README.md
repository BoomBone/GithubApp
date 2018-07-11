# Kotlin联系项目GithubApp

## Boolean扩展
- 定义扩展方法
- 密封类
- 泛型的协变
- 内联函数
- 高阶函数

## SharePreference扩展方法
- ReadWriteProperty读写代理
- with函数
>with函数，可以用它对同一个对象执行多次操作，而不需要反复把对象名称写出来
```
 with(prefs.edit()) {
            when (value) {
                is Long -> putLong(key, value)
                is Int -> putInt(key, value)
                is Boolean -> putBoolean(key, value)
                is String -> putString(key, value)
                else -> {
                }
            }
        }
```