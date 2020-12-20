package cn.ricardowang.www.service;

import cn.ricardowang.www.javabean.Cart;
import cn.ricardowang.www.javabean.Item;

import javax.servlet.http.HttpSession;

/**
 * @Author: wangqin
 * @Date: 2020/12/20 0020 - 12 -20 -9:23
 * @Description: cn.ricardowang.www.service
 * @version: 1.0
 */
//todo:添加商品到购物车
//todo:购买所有商品——————加到Order
//todo：购买单一物品——————交给Order处理
//todo:购物车上限500
//todo:删除购物车中某一物品
//todo:清空购物车
//todo:修改购物车中某一物品数量——————为0删除
//todo:当浏览器退出后，存到数据库
//todo:从数据库加载购物车
public class CartService {

    public static void addOneItemToCart(Item item, HttpSession session) {
        //获取会话范围内的购物车
        Cart cart = (Cart) session.getAttribute("cart");
        //向购物车中添加物品

        //将数据写入会话范围
        session.setAttribute("cart", cart);
    }
}
