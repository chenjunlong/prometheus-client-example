# prometheus-client-example
### prometheus java client 结合限流组件使用的Demo


1.部署 prometheus、java-prometheus-reload

步骤：
https://github.com/chenjunlong/java-prometheus-reload

2.本示例代码已经集成了 java-prometheus-starter

https://github.com/chenjunlong/java-prometheus-starter

3.部署 grafana

centos

wget https://s3-us-west-2.amazonaws.com/grafana-releases/release/grafana-3.1.1-1470047149.x86_64.rpm 

sudo yum localinstall grafana-3.1.1-1470047149.x86_64.rpm 

sudo /sbin/chkconfig --add grafana-server

sudo service grafana-server start

配置 prometheus 数据源，配置面板

https://oscimg.oschina.net/oscnet/61591d9732e487950a2a79a43deb2e3dec6.jpg
https://oscimg.oschina.net/oscnet/86cd3606801000fe6e5412a71aeed9e4b49.jpg
https://oscimg.oschina.net/oscnet/c35faa75ec511b09e513e3f9a7873f6c6f8.jpg
https://oscimg.oschina.net/oscnet/51db0a1e5ae2fe9be05c9838a29db4a7d9f.jpg
https://oscimg.oschina.net/oscnet/cd3f346d9f67c9db5a4cf0cd6ce51088684.jpg
https://oscimg.oschina.net/oscnet/c3b5cb1865bb37c69d85513a435b8b2da8a.jpg
https://oscimg.oschina.net/oscnet/65bcc8af9510adfc375750c61b66075c1c2.jpg

4.触发限流，查看限流统计

https://oscimg.oschina.net/oscnet/4099073860c2183cb43fdaf9b0213105873.jpg


