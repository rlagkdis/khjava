package com.kh.practice.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music.model.vo.Music;

public class MusicController {
	private List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	/**
	 * ������ ��ġ�� �� �߰�
	 * @param music
	 */
	public void addAtLast(Music music) {
		mList.add(music);
	}
	/**
	 * ù ��ġ�� �� �߰�
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	/**
	 * �� ����
	 * @param index
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}
	
	public void updateMusic(int index, Music music) {
		mList.set(index, music);
	}
	/**
	 * �̸����� ���� ��� �˻�
	 * @param title
	 */
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for(Music mOne: mList) {
			if(mOne.getTitle().equals(title)) {
				findList.add(mOne);
			}
		} 
		return findList;
	}
	/**
	 * �̸����� �ε��� ��ȸ
	 * @param musicName
	 * @return
	 */
	public int searchOneByName(String musicName) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			if(musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}
	/**
	 * �ε����� ����Ʈ���� ��ȸ
	 * @param index
	 * @return Music
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);  //Music
	}
	
	/**
	 * ��ü ������ ��ȸ
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
	public void sortByTitleAsc() {
		// �����ϱ�
//		int [] nums = {4,3,2,1};
		for(int i = 1; i < mList.size(); i++) {
			for(int e = 0; e <i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getTitle().compareTo(mTwo.getTitle())< 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
//				if(mOne.getTitle() < mTwo.getTitle()) {}  //��Ʈ���� ��Һ� �Ұ�
//				if(nums[i] > nums[i+1]) {
//					int temp = nums[i+1];
//					nums[i+1] = nums[i];
//					nums[i] = temp;
//				}
			}
		}
	}
	
	public void sortByTitleDesc() {
		for(int i = 0; i < mList.size(); i++) {
			for(int e = 0; e <i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getTitle().compareTo(mTwo.getTitle())> 1) {
					Music temp = mOne;
					mList.set(i,mTwo);
					mList.set(e, temp);
				}
	}
	}
	}
	
	public void sortBySingerAsc() {
		for(int i = 1; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
		
	}
	
	public void sortBySingerDesc() {
		for(int i = 1; i < mList.size(); i++) {
			for(int e = 0; e < i; e++) {
				Music mOne = (Music)mList.get(i);
				Music mTwo = (Music)mList.get(e);
				if(mOne.getSinger().compareTo(mTwo.getSinger()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
		
	}

}
