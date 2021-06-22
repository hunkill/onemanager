package me.kuku.onemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriveConfig {
	private String proxy;
	private String picPath;
	private String onlyPic;
	private String hide;
}
