## 2019/3/12
### 1.实现了tag和category跳转

**注意:** watch监听路由变化

### 2.调整了时间格式化

## 2019/3/11
### 1.实现热度排行

### 2.但是在服务器端不能显示网业图标

### 3.问题2解决

### 4.优化了nginx gzip压缩，初次加载页面时加载量从1.5MB压缩到600kb

- 修改./build/index.js 
```javascript
// Gzip off by default as many popular static hosts such as
// Surge or Netlify already gzip all static assets for you.
// Before setting to `true`, make sure to:
// npm install --save-dev compression-webpack-plugin
productionGzip: true,
productionGzipExtensions: ['js', 'css']
```
**注意:** compression-webpack-plugin对应的webpack版本

- 修改nginx.conf
```conf
gzip on; #开启或关闭gzip on off　　 
gzip_static on;#是否开启gzip静态资源
gzip_disable "msie6"; #不使用gzip IE6
gzip_min_length 100k; #gzip压缩最小文件大小，超出进行压缩（自行调节）
gzip_buffers 4 16k; #buffer 不用修改
gzip_comp_level 3; #压缩级别:1-10，数字越大压缩的越好，时间也越长
gzip_types text/plain application/x-javascript text/css application/xml text/javascript application/x-httpd-php image/jpeg image/gif image/png; #  压缩文件类型
gzip_vary off;  #跟Squid等缓存服务有关，on的话会在Header里增加 "Vary: Accept-Encoding"
```
5. 实现走马灯，目前打算给category用
图片统一:1964/1160

## 2019/3/7 
### 1.解决了登陆时token验证错误时出的bug

token验证错误时，删除本地token

### 2.实现了viewcount

初期实现，没用redis，只是浏览一次就加一次。

### 3.实现动态修改浏览器标题，加了dog图标

### 4.计划2019/3/8实现联表查询实现按tag浏览文章功能

### 5.LoL时间到了，嘻嘻嘻。。。

# blogapp

> A Vue.js project

## Build Setup

``` bash
# install dependencies
npm install

# serve with hot reload at localhost:8080
npm run dev

# build for production with minification
npm run build

# build for production and view the bundle analyzer report
npm run build --report

# run unit tests
npm run unit

# run e2e tests
npm run e2e

# run all tests
npm test
```

For a detailed explanation on how things work, check out the [guide](http://vuejs-templates.github.io/webpack/) and [docs for vue-loader](http://vuejs.github.io/vue-loader).



