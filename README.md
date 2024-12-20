![1](1.jpg)

本项目借鉴了vulhub仓库的模式，用户只需执行一条docker-compose命令即可轻松部署漏洞环境。

项目的独特优势在于，我们会定期快速更新，及时引入市面上最新发现的漏洞，帮助用户紧跟安全研究的前沿。

vulhub项目地址：https://github.com/vulhub/vulhub

## Usage

```
# 下载项目
wget https://github.com/wi1kwegam4a/VulhubExpand/archive/refs/heads/main.zip
unzip main.zip
cd VulhubExpand-main

# 进入某一个漏洞/环境的目录
cd SCM-Manager/CVE-2023-33829

# 启动整个环境
docker compose up -d
```

每个环境目录下都有相应的说明文件，请阅读该文件，进行漏洞/环境测试。