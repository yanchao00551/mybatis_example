package org.skeyedu.vo;

import org.skeyedu.entity.SkeyeduOrderDetail;

import java.util.List;
import java.util.Map;

/**
 * @PackageName:org.skeyedu.vo
 * @ClassName:SkeyduOrderDetailVO
 * @Description:
 * @author: 悟空
 * @date: 2021/3/30 15:55
 * @email: 10947@163.com
 */
public class SkeyduOrderDetailVO extends SkeyeduOrderDetail {

    private SkeyeduOrderDetail skeyeduOrderDetail;

    private Integer costStart;
    private Integer costEnd;

    private List<Integer> userIds;

    private Map<String,Object> conditionMap;

    public Map<String, Object> getConditionMap() {
        return conditionMap;
    }

    public void setConditionMap(Map<String, Object> conditionMap) {
        this.conditionMap = conditionMap;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public Integer getCostStart() {
        return costStart;
    }

    public void setCostStart(Integer costStart) {
        this.costStart = costStart;
    }

    public Integer getCostEnd() {
        return costEnd;
    }

    public void setCostEnd(Integer costEnd) {
        this.costEnd = costEnd;
    }

    @Override
    public Integer getId() {
        return skeyeduOrderDetail.getId();
    }

    @Override
    public void setId(Integer id) {
        skeyeduOrderDetail.setId(id);
    }

    @Override
    public Integer getOrderid() {
        return skeyeduOrderDetail.getOrderid();
    }

    @Override
    public void setOrderid(Integer orderid) {
        skeyeduOrderDetail.setOrderid(orderid);
    }

    @Override
    public Integer getProductid() {
        return skeyeduOrderDetail.getProductid();
    }

    @Override
    public void setProductid(Integer productid) {
        skeyeduOrderDetail.setProductid(productid);
    }

    @Override
    public Integer getQuantity() {
        return skeyeduOrderDetail.getQuantity();
    }

    @Override
    public void setQuantity(Integer quantity) {
        skeyeduOrderDetail.setQuantity(quantity);
    }

    @Override
    public Float getCost() {
        return skeyeduOrderDetail.getCost();
    }

    @Override
    public void setCost(Float cost) {
        skeyeduOrderDetail.setCost(cost);
    }

    @Override
    public String toString() {
        return "SkeyduOrderDetailVO{" +
                "skeyeduOrderDetail=" + skeyeduOrderDetail +
                ", costStart=" + costStart +
                ", costEnd=" + costEnd +
                ", userIds=" + userIds +
                '}';
    }
}
