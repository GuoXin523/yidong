# Layout3 项目 README

## 项目概述

这是一个名为 Layout3 的 Android 应用项目，位于 `D:\androidstudio-projectnew\layout\layout3\app` 目录下。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/layout_3/
│   │   │   └── MainActivity.java
│   │   ├── res/
│   │   │   ├── drawable/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   ├── values/
│   │   │   └── xml/
│   │   └── AndroidManifest.xml
│   ├── androidTest/
│   └── test/
├── build.gradle.kts
└── build/
```


## 项目配置

### Android Manifest
- **包名**: `com.example.android.layout_3`
- **应用名称**: 从 `@string/app_name` 获取
- **最低 SDK 版本**: 24
- **目标 SDK 版本**: 34
- **主题**: `@style/Theme.Layout3`

### 主要组件
- **MainActivity**: 应用的主活动，配置为启动活动
- **图标**: 使用 `@mipmap/ic_launcher` 和 `@mipmap/ic_launcher_round`
- **权限**: 包含备份和数据提取规则

### 依赖库
- **androidx.core:core:1.9.0**
- **androidx.test:core:1.5.0** (测试依赖)
- **androidx.test:runner:1.5.2** (测试依赖)

## 应用功能

该项目包含一个基础的 Android 应用结构，具有以下配置：

- 支持备份和恢复功能
- 包含深色主题适配
- 配置了数据提取规则
- 包含启动器活动（MainActivity）

## 构建系统

- 使用 Gradle 构建系统
- 采用 Kotlin DSL ([build.gradle.kts](file://D:\androidstudio-projectnew\layout\layout3\build.gradle.kts))
- 包含调试和测试构建配置



## 资源

- **颜色**: 定义在 `res/values/colors.xml`
- **字符串**: 定义在 `res/values/strings.xml`
- **主题**: 定义在 `res/values/themes.xml`
- **样式**: 定义在 `res/values/styles.xml`
- **启动器图标**: 包括背景和前景图层

## 构建输出

构建产物位于 `build/` 目录，包括：
- 编译的 APK 文件
- 中间构建文件
- 资源合并结果
- 日志文件
