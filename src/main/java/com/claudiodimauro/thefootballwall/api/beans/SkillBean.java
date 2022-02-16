package com.claudiodimauro.thefootballwall.api.beans;

import com.claudiodimauro.thefootballwall.utils.enums.FootPreference;
import com.claudiodimauro.thefootballwall.utils.enums.WorkRate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SkillBean {
	private int skillMoves;
	private int weakFoot;
	private WorkRate attWorkRate;
	private FootPreference preferredFoot;	
	
	public SkillBean setSkillMoves(Integer skillMoves) {
		if(skillMoves == null || skillMoves > 5 || skillMoves < 1) {
			this.skillMoves = 3;
		} else {
			this.skillMoves = skillMoves.intValue();
		}
		return this;
	}
	
	public SkillBean setWeakFoot(Integer weakFoot) {
		if(weakFoot == null || weakFoot > 5 || weakFoot < 1) {
			this.weakFoot = 3;
		} else {
			this.weakFoot = weakFoot.intValue();
		}
		return this;
	}
	
	public SkillBean setAttWorkRate(WorkRate attWorkRate) {
		this.attWorkRate = attWorkRate;
		return this;
	}
	
	public SkillBean setPreferredFoot(FootPreference preferredFoot) {
		this.preferredFoot = preferredFoot;
		return this;
	}
}
