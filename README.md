# p1 Android 项目 README

## 项目概述

这是一个 Android 应用项目，项目名为 `p1`，包名为 `com.example.android.p1`。该项目是一个基础的 Android 应用模板，使用 Android Studio 创建并配置。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/p1/
│   │   │   └── MainActivity.java          # 主 Activity
│   │   ├── res/                          # 资源文件
│   │   │   ├── drawable/                 # 图片资源
│   │   │   ├── layout/                   # 布局文件
│   │   │   ├── mipmap-anydpi-v26/        # 应用图标
│   │   │   ├── values/                   # 字符串、样式等资源
│   │   │   ├── values-night/             # 夜间模式资源
│   │   │   └── xml/                      # XML 配置文件
│   │   └── AndroidManifest.xml           # 应用配置文件
│   ├── androidTest/                      # 仪器化测试
│   └── test/                             # 单元测试
├── build.gradle.kts                      # 模块级构建配置
└── build/                                # 构建输出目录
```


## 项目配置

### 基本信息
- **应用名称**: P1 (通过 `@string/app_name` 定义)
- **包名**: `com.example.android.p1`
- **版本号**: 1.0 (versionCode: 1)
- **最小 SDK 版本**: API 24
- **目标 SDK 版本**: API 34

### 应用权限
- `android.permission.POST_NOTIFICATIONS` - 用于发送通知

### 应用组件
- **MainActivity**: 应用的主入口 Activity
- **启动器图标**: `@mipmap/ic_launcher` 和 `@mipmap/ic_launcher_round`
- **主题**: `@style/Theme.P1` (Material Design 主题)

## AndroidManifest.xml 说明

`AndroidManifest.xml` 文件包含以下主要配置:

- **Application 配置**:
  - 应用图标和圆角图标
  - 应用名称
  - 支持 RTL 布局
  - 数据提取规则和备份规则
  - Material Design 主题

- **Activity 配置**:
  - [MainActivity](file://D:\androidstudio-projectnew\test3\p1\app\src\main\java\com\example\android\p1\MainActivity.java#L21-L96) 设置为导出 (exported="true")
  - 包含 `MAIN` 活动和 `LAUNCHER` 类别，使应用可以显示在启动器中

- **自动生成的组件**:
  - 来自 AndroidX 库的权限声明
  - `InitializationProvider` 用于库初始化

## 依赖库

项目使用了以下 AndroidX 库:
- **Core Library** (`androidx.core:core:1.9.0`)
- **Material Design** (`com.google.android.material:material:1.10.0`)
- **Emoji2** (`androidx.emoji2:emoji2:1.2.0`)
- **Lifecycle Process** (`androidx.lifecycle:lifecycle-process:2.6.1`)
- **Print Library** (`androidx.print:print:1.0.0`)

## 资源文件

### 图标资源
- 各种密度的启动器图标 (mipmap-mdpi, mipmap-xhdpi, mipmap-xxhdpi, mipmap-xxxhdpi)
- 标准图标和圆角图标

### XML 配置文件
- [data_extraction_rules.xml](file://D:\androidstudio-projectnew\test3\p1\app\src\main\res\xml\data_extraction_rules.xml) - 数据提取规则
- [backup_rules.xml](file://D:\androidstudio-projectnew\test3\p1\app\src\main\res\xml\backup_rules.xml) - 备份规则

### 主题和样式
- 使用 Material Design 主题
- 支持夜间模式

## 构建配置

- **构建系统**: Gradle with Kotlin DSL
- **调试模式**: 已启用调试功能
- **APK 输出**: 在 `build/outputs/` 目录下


## 注意事项

- 项目使用了 AndroidX 库，确保与现代 Android 开发实践兼容
- 应用图标使用 WebP 格式
- 包含了数据备份和提取规则，符合 Android 12+ 的要求
- 已自动添加必要的权限和组件，以支持 AndroidX 库的功能

