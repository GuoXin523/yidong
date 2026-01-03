# P4 Android 项目 README

这是一个 Android 应用项目，名为 P4，使用 Android Studio 开发。项目结构遵循标准的 Android 项目布局。

## 项目结构

```
P4/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/p4/
│   │   │   └── MainActivity.java          # 主 Activity 文件
│   │   ├── res/                           # 资源文件目录
│   │   │   ├── drawable/                  # 图片资源
│   │   │   ├── layout/                    # 布局文件
│   │   │   ├── menu/                      # 菜单资源
│   │   │   ├── mipmap-anydpi-v26/         # 应用图标
│   │   │   ├── values/                    # 字符串、主题等资源
│   │   │   │   ├── strings.xml            # 应用名称等字符串资源
│   │   │   │   └── themes.xml             # 主题配置
│   │   │   ├── values-night/              # 夜间模式主题
│   │   │   └── xml/                       # XML 配置文件
│   │   │       ├── backup_rules.xml       # 备份规则
│   │   │       └── data_extraction_rules.xml # 数据提取规则
│   │   └── AndroidManifest.xml           # 应用配置文件
├── build.gradle.kts                      # Gradle 构建脚本
└── build/                                # 构建输出目录
```


## 项目配置

### 应用信息
- **应用名称**: `@string/app_name` (定义在 [strings.xml](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/values/strings.xml#L1-L3))
- **应用图标**: [ic_launcher](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml#L1-L6) 和 [ic_launcher_round](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml#L1-L6)
- **主题**: `@style/Theme.P4` (定义在 [themes.xml](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/values/themes.xml#L2-L8))
- **支持 RTL**: 是

### 权限和配置
- **允许备份**: `true`
- **数据提取规则**: `@xml/data_extraction_rules`
- **完整备份内容**: `@xml/backup_rules`
- **目标 API**: 31 (通过 `tools:targetApi` 指定)

### 主 Activity
- **Activity 名称**: [MainActivity](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/java/com/example/android/p4/MainActivity.java#L10-L23)
- **导出状态**: `true`
- **启动器**: 包含 `MAIN` action 和 `LAUNCHER` category，作为应用入口

## 主要功能

- 项目包含一个主 Activity ([MainActivity](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/java/com/example/android/p4/MainActivity.java#L10-L23))
- 支持日夜主题切换（在 [values-night/themes.xml](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/values-night/themes.xml#L2-L6) 中定义）
- 配置了数据备份和提取规则
- 包含单元测试和仪器化测试文件

## 构建系统

- 使用 Gradle 进行构建
- 构建脚本: [build.gradle.kts](file:///D:/androidstudio-projectnew/test3/p4/app/build.gradle.kts)
- 使用 AndroidX 库


## 资源文件

- **字符串资源**: 定义在 [values/strings.xml](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/values/strings.xml#L1-L3)
- **主题资源**: 定义在 [values/themes.xml](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/values/themes.xml#L2-L8) 和 [values-night/themes.xml](file:///D:/androidstudio-projectnew/test3/p4/app/src/main/res/values-night/themes.xml#L2-L6)
- **XML 配置**: 包括备份规则和数据提取规则
