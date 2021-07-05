package cinema.dto.response;

import java.util.List;

public class ShoppingCartResponseDto {
    private Long userId;
    private List<Long> ticketIds;

    public void setTicketIds(List<Long> ticketIds) {
        this.ticketIds = ticketIds;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public List<Long> getTicketIds() {
        return ticketIds;
    }
}
