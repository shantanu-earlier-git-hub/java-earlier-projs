package basics1.app.users;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    @Id
    private Integer id;

    @Column(name = "userid")
    private Integer userid;

    @Column(name = "is_account_expired")
    private Boolean isAccountExpired;

    @Column(name = "is_account_locked")
    private Boolean isAccountLocked;

    @Column(name = "is_credential_expired")
    private Boolean isCredentialsExpired;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

}
