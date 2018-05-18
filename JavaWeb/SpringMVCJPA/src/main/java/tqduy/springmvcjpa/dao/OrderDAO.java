package tqduy.springmvcjpa.dao;

import java.util.List;

import tqduy.springmvcjpa.model.CartInfo;
import tqduy.springmvcjpa.model.OrderDetailInfo;
import tqduy.springmvcjpa.model.OrderInfo;
import tqduy.springmvcjpa.model.PaginationResult;

public interface OrderDAO {
	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
