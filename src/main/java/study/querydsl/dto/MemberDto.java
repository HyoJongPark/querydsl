package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class MemberDto {

    private String username;
    private int age;

    @QueryProjection //해당 애노테이션을 사용하고, CompileQuerydsl 을 실행하면, 엔티티와 동일하게 DTO 의 Q 타입이 생성된다.
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
