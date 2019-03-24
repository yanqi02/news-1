<!DOCTYPE html>

<!--页面字符编码utf-8-->

<%@ page language="java" import="java.util.*,java.net.*"
             contentType="text/html; charset=utf-8" pageEncoding="utf-8"
             errorPage=""%>
<html>

<head>

    <%--前端框架 bootstarp========================================================================--%>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="static/js/jquery-3.3.1.js/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
        <%--前端框架 bootstarp========================================================================--%>

    <meta charset="UTF-8">
    <!--
    有时候会遇到一个很诡异的问题：为什么我的IE浏览器都升级到IE9以上了，但是浏览器的文档模式却是IE8
怎么解决这个问题呢？
这句话可以保证让IE的文档模式永远都是最新的
-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!--
    width=device-width ： 网页宽度等于设备宽度
initial-scale=1.0 ： 初始缩放比例为1.0 。网页初始页面的大小占整个面积的100%
maximum-scale=1.0 ： 最大缩放比例为1.0 ，
user-scalable ： 用户是否可以手动缩放
-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title></title>
    <link rel="stylesheet" href="css/font-awesome.min.css" />
    <!-- jQuery -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/jquery.backstretch.js"></script>
    <!--加载ie浏览器的兼容性文件 因为IE9，IE6、7、8不支持媒体查询，所以必须加载以下文件
-->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>


        .container {
            padding: 7.2em 0;

            background-color:darkcyan;
        }

        .user-login {
            width: 24%;

            margin: 0 auto;
        }

        .user-login {
            background: #fff;
            border-radius: 0.8em;
            -o-border-radius: 0.8em;
            -moz-border-radius: 0.8em;
            -webkit-border-radius: 0.8em;

        }

        .user-login h1 {
            font-size: 1.2em;
            color: #fff;
            background: #00acec;
            padding: 1.4em 0em;
            text-align: center;
            border-top-right-radius: 0.6em;
            -o-border-top-right-radius: 0.6em;
            -moz-border-top-right-radius: 0.6em;
            -webkit-border-top-right-radius: 0.6em;
            border-top-left-radius: 0.6em;
            -o-border-top-left-radius: 0.6em;
            -moz-border-top-left-radius: 0.6em;
            -webkit-border-top-left-radius: 0.6em;
        }

        .user-login p {
            color: #868686;
            font-size: 19px;
            padding-bottom: 15px;
        }

        form.login {
            padding: 2% 2.9em;
        }

        form.login li {
            list-style: none;
            width: 99%;
            margin: 0 auto;
            border: 1px solid #D6D0D0;
        }

        form.login li.base {
            margin-bottom: 10px;
        }

        .user-login input[type="text"],
        .user-login input[type="password"] {
            width: 82%;
            padding: 0.7em 0.7em;
            color: #8f9091;
            font-size: 15px;
            outline: none;
            background: #fff;
            border: none;
            -webkit-appearance: none;
            font-weight: 400;
        }

        .submit-login {
            margin-top: 2.3em;
        }

        .user-login input[type="submit"] {
            font-size: 18px;
            font-weight: 400;
            color: #fff;
            display: inline-block;
            padding: 0.9em 0.9em;
            width: 100%;
            cursor: pointer;
            -webkit-appearance: none;
            border: none;
            outline: none;
            background: #fdae1f;
            border-radius: 0.3em;
            -o-border-radius: 0.3em;
            -webkit-border-radius: 0.3em;
            -moz-border-radius: 0.3em;
        }

        .user-login input[type="submit"]:hover {
            background: #00acec;
            color: #fff;
        }
    </style>
    <!--<script>
        $(function() {
            $(".container").css({
                opacity: .8
            }); //设置透明度
            $.backstretch([
                "img/timg.jpg",
                "img/timg2.jpg"
            ], {
                duration: 3000,
                fade: 750
            });
        });
    </script>-->
</head>

<body>

<div class="container">
    <div class="user-login">
        <h1>login</h1>
        <form class="login">
            <p>username / email</p>
            <li class="base">
                <input type="text" value=""><i class="fa fa-user"></i>
            </li>
            <p>password</p>
            <li>
                <input type="password" value=""><i class="fa fa-lock"></i>
            </li>

            <div class="submit-login">
                <input type="submit" value="log in">
            </div>
        </form>
    </div>
</div>

<audio controls="controls" >
    <source src="music/Take me hand.mp3" type="audio/mp3"></source>
    您的浏览器不支持 audio 元素。
</audio>
<button   class="btn btn-success">按钮</button>


</body>
</html>