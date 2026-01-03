# 项目 README

## 项目概述

这是一个 Android 应用项目，项目名为 **P3**，包名为 `com.example.android.p3`。该项目是一个基础的 Android 应用模板，包含了基本的 UI 组件、资源文件和测试配置。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/p3/          # 主要 Java 源代码
│   │   │   └── MainActivity.java                 # 主 Activity
│   │   ├── res/                                  # 资源文件
│   │   │   ├── drawable/                         # 图片和绘制资源
│   │   │   ├── layout/                           # 布局文件
│   │   │   ├── menu/                             # 菜单资源
│   │   │   ├── mipmap-anydpi-v26/                # 应用图标
│   │   │   ├── values/                           # 字符串、颜色、主题等
│   │   │   └── xml/                              # XML 配置文件
│   │   └── AndroidManifest.xml                   # 应用配置文件
│   ├── androidTest/                              # Android 测试代码
│   │   └── java/com/example/android/p3/
│   │       └── ExampleInstrumentedTest.java
│   └── test/                                     # 单元测试代码
│       └── java/com/example/android/p3/
│           └── ExampleUnitTest.java
└── build.gradle.kts                              # Gradle 构建配置文件
```


## 项目特性

- **API 级别**：最低支持 API 24 (Android 7.0)，目标 API 34 (Android 14)
- **架构组件**：使用了 AndroidX 库（[androidx.core:core:1.9.0](symbol://androidx.core:core:1.9.0)、[androidx.test](symbol://androidx.test) 等）
- **主题**：使用自定义主题 `Theme.P3`
- **国际化**：支持基本的字符串资源管理

## 主要文件说明

### AndroidManifest.xml
- 应用包名：`com.example.android.p3`
- 应用名称：从 `@string/app_name` 获取
- 主 Activity：[MainActivity](symbol://com.example.android.p3.MainActivity)
- 支持夜间模式

### MainActivity.java
- 应用的主入口 Activity
- 包含基本的 UI 组件和菜单功能

### 资源文件
- **colors.xml**：应用颜色定义
- **strings.xml**：字符串资源（包含应用名称）
- **themes.xml**：应用主题配置
- **activity_main.xml**：主界面布局文件
- **menu_main.xml**：主菜单定义

### 测试文件
- **ExampleInstrumentedTest.java**：Android 仪器化测试
- **ExampleUnitTest.java**：本地单元测试

## 构建配置

项目使用 Gradle 构建系统，包含以下特性：
- AndroidX 库支持
- 自动资源压缩和优化
- 多种构建类型支持（debug、release）

## 依赖项

项目使用了以下主要依赖：
- AndroidX Core 库 ([androidx.core:core:1.9.0](symbol://androidx.core:core:1.9.0))
- Android 测试库 ([androidx.test](symbol://androidx.test) 系列)

## 运行要求

- Android Studio
- 最低 API 级别：24 (Android 7.0)
- 目标 API 级别：34 (Android 14)
