
package model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "udid")
	int udid;
	@Column(name = "youtube")
	String youtube_channel;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "uid")
	User user1;

	/**
	 * @return the udid
	 */
	public int getUdid() {
		return udid;
	}

	/**
	 * @param udid the udid to set
	 */
	public void setUdid(int udid) {
		this.udid = udid;
	}

	/**
	 * @return the youtube_channel
	 */
	public String getYoutube_channel() {
		return youtube_channel;
	}

	/**
	 * @param youtube_channel the youtube_channel to set
	 */
	public void setYoutube_channel(String youtube_channel) {
		this.youtube_channel = youtube_channel;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user1;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user1 = user;
	}

}
