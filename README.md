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

4.触发限流，查看限流统计
