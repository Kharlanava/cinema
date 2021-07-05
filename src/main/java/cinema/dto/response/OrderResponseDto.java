package cinema.dto.response;

import java.util.List;

public class OrderResponseDto {
    private Long id;
    private List<Long> ticketIds;
    private Long userId;
    private String orderTime;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTicketIds(List<Long> ticketIds) {
        this.ticketIds = ticketIds;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Long getId() {
        return id;
    }

    public List<Long> getTicketIds() {
        return ticketIds;
    }

    public Long getUserId() {
        return userId;
    }

    public String getOrderTime() {
        return orderTime;
    }
}
