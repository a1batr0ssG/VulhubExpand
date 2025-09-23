![1](1.jpg)

本项目借鉴了vulhub仓库的模式，用户只需执行一条docker命令即可轻松部署漏洞环境。

项目的独特优势在于，我们会定期快速更新，及时引入市面上最新发现的漏洞，帮助用户紧跟安全研究的前沿。

vulhub项目地址：https://github.com/vulhub/vulhub

VulhubExpand项目地址：https://github.com/a1batr0ssG/VulhubExpand

## POC及环境列表

| 编号           | 描述                                                         | 复现环境 |
| -------------- | ------------------------------------------------------------ | -------- |
| VE-2025-0001   | 百度网盘Windows客户端远程命令执行漏洞                        | 已有     |
| CVE-2024-37032 | Ollama任意文件读取漏洞                                       | 已有     |
| CVE-2024-42327 | Zabbix addRelatedObjects 函数后台SQL注入漏洞                 | 已有     |
| CVE-2024-45216 | Apache Solr身份验证绕过漏洞                                  | 已有     |
| CVE-2024-53677 | Apache Struts FileUploadInterceptor 文件上传漏洞             | 已有     |
| CVE-2025-1302  | JSONPath Plus远程代码执行漏洞                                | 已有     |
| CVE-2025-1661  | WordPress HUSKY插件前台任意文件包含漏洞                      | 暂无     |
| CVE-2025-1750  | llama_Index SQL注入漏洞                                      | 已有     |
| CVE-2025-2266  | WordPress Checkout Mestres do WP for WooCommerce插件管理员用户创建漏洞 | 暂无     |
| CVE-2025-2294  | WordPress Kubio AI Page Builder插件前台任意文件读取漏洞      | 暂无     |
| CVE-2025-25163 | WordPress A/B Image Optimizer插件后台任意文件下载漏洞        | 暂无     |
| CVE-2025-25296 | Label Studio前台XSS漏洞                                      | 已有     |
| CVE-2025-29927 | Next.js中间件授权绕过漏洞                                    | 已有     |
| CVE-2025-30208 | Vite任意文件读取漏洞                                         | 已有     |
| CVE-2025-30567 | WordPress WP01插件任意文件下载漏洞                           | 已有     |
| CVE-2025-3102  | WordPress OttoKit插件前台管理员账户创建漏洞                  | 已有     |
| CVE-2025-31644 | F5 BIG-IP Appliance 模式命令执行漏洞                         | 暂无     |
| CVE-2025-32118 | WordPress CMP插件后台任意命令执行漏洞                        | 已有     |
| CVE-2025-32432 | Craft CMS命令执行漏洞                                        | 暂无     |
| CVE-2025-32433 | Erlang/OTP SSH 远程代码执行漏洞                              | 已有     |
| CVE-2025-32463 | Linux Sudo提权漏洞                                           | 已有     |
| CVE-2025-3248  | Langflow远程代码执行漏洞                                     | 已有     |
| CVE-2025-48827 | vBulletin远程代码执行漏洞                                    | 暂无     |
| CVE-2025-49113 | Roundcube Mail后台代码执行漏洞复现                           | 暂无     |
| CVE-2025-49144 | Notepad++提权漏洞                                            | 已有     |
| CVE-2025-54309 | CrushFTP条件任意管理员用户添加漏洞                           | 已有     |
| CVE-2025-54424 | 1Panel远程命令注入漏洞                                       | 暂无     |
| CVE-2025-58434 | Flowise AI账户接管漏洞                                       | 已有     |
| CVE-2025-7340  | WordPress HT Contact Form Widget插件前台命令执行漏洞         | 已有     |
| CVE-2025-8088  | WinRAR 命令执行漏洞                                          | 已有     |
| CVE-2025-9074  | Docker桌面版容器逃逸漏洞                                     | 暂无     |

## 使用方法

```
# 下载项目
wget https://github.com/a1batr0ssG/VulhubExpand/archive/refs/heads/main.zip
unzip main.zip
cd VulhubExpand-main

# 进入某一个漏洞/环境的目录
cd SCM-Manager/CVE-2023-33829

# 启动整个环境
docker compose up -d
```

每个环境目录下都有相应的说明文件，请阅读该文件，进行漏洞/环境测试。