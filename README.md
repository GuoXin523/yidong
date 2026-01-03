# Layout4 Android 项目 README

## 项目概述

这是一个基于 Android 平台的简单应用程序项目，项目名为 `layout4`。该项目包含一个主 Activity ([MainActivity](file://D:\androidstudio-projectnew\layout\layout4\app\src\main\java\com\example\android\layout4\MainActivity.java#L10-L23))，使用了 AndroidX 库，并配置了标准的应用程序组件。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/layout4/
│   │   │   └── MainActivity.java          # 主 Activity
│   │   ├── res/                          # 资源文件
│   │   │   ├── drawable/                 # 图像资源
│   │   │   ├── layout/                   # 布局文件
│   │   │   ├── mipmap-anydpi-v26/        # 应用图标
│   │   │   ├── values/                   # 字符串、样式等值
│   │   │   └── xml/                      # XML 配置文件
│   │   └── AndroidManifest.xml           # 应用程序清单
├── build.gradle.kts                      # Gradle 构建脚本
└── ...
```


## 配置信息

### 应用程序属性

- **应用名称**: 从 `@string/app_name` 资源获取
- **图标**: `@mipmap/ic_launcher` 和 `@mipmap/ic_launcher_round`
- **主题**: `@style/Theme.Layout4`
- **支持 RTL**: 已启用 (`android:supportsRtl="true"`)

### 权限和功能

- **允许备份**: `android:allowBackup="true"`
- **数据提取规则**: `@xml/data_extraction_rules`
- **完整备份内容**: `@xml/backup_rules`
- **目标 API 级别**: 31 (`tools:targetApi="31"`)

### 主 Activity 配置

- **Activity 名称**: `.MainActivity`
- **导出状态**: `android:exported="true"`
- **启动器**: 配置为应用程序主入口点
  - Action: `android.intent.action.MAIN`
  - Category: `android.intent.category.LAUNCHER`

## 依赖库

项目使用了 AndroidX 库（版本 1.9.0），包括：

- `androidx.core:core:1.9.0` - 提供 `CoreComponentFactory`

## 构建配置

- 项目使用 Gradle 进行构建管理
- 使用 Kotlin DSL ([build.gradle.kts](file://D:\androidstudio-projectnew\layout\layout4\build.gradle.kts)) 作为构建脚本
 (仅调试版本)

## 文件说明

- [AndroidManifest.xml](file://D:\androidstudio-projectnew\layout\layout4\app\src\main\AndroidManifest.xml) - 应用程序的主要配置文件
- [MainActivity.java](file://D:\androidstudio-projectnew\layout\layout4\app\src\main\java\com\example\android\layout4\MainActivity.java) - 应用的主 Activity 类
- [themes.xml](file://D:\androidstudio-projectnew\layout\layout4\app\src\main\res\values\themes.xml) - 应用主题定义
- [strings.xml](file://D:\androidstudio-projectnew\layout\layout4\app\src\main\res\values\strings.xml) - 应用字符串资源
- `ic_launcher` 图标 - 应用的启动图标资源

这个项目是一个标准的 Android 应用程序模板，可以作为进一步开发的基础。
