package com.trainingbasket.employeestatsmailer.modal;

public class AbsentismRecord {
	private int ID;
	private int reasonForAbsence;
	private int monthOfAbsence;
	private int dayOfTheWeek;
	private int seasons;
	private int transportationExpense;
	private int distanceFromResidenceToWork;
	private int serviceTime;
	private int age;
	private int workLoadAverageByDay;
	private int hitTarget;
	private int disciplinaryFailure;
	private int education;
	private int son;
	private int socialDrinker;
	private int socialSmoker;
	private int pet;
	private int weight;
	@Override
	public String toString() {
		return "AbsentismRecord [ID=" + ID + ", reasonForAbsence=" + reasonForAbsence + ", monthOfAbsence="
				+ monthOfAbsence + ", dayOfTheWeek=" + dayOfTheWeek + ", seasons=" + seasons
				+ ", transportationExpense=" + transportationExpense + ", distanceFromResidenceToWork="
				+ distanceFromResidenceToWork + ", serviceTime=" + serviceTime + ", age=" + age
				+ ", workLoadAverageByDay=" + workLoadAverageByDay + ", hitTarget=" + hitTarget
				+ ", disciplinaryFailure=" + disciplinaryFailure + ", education=" + education + ", son=" + son
				+ ", socialDrinker=" + socialDrinker + ", socialSmoker=" + socialSmoker + ", pet=" + pet + ", weight="
				+ weight + ", height=" + height + ", bodyMassIndex=" + bodyMassIndex + ", sbsenteeismTimeInHours="
				+ sbsenteeismTimeInHours + "]";
	}

	private int height;
	private int bodyMassIndex;
	private int sbsenteeismTimeInHours;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getReasonForAbsence() {
		return reasonForAbsence;
	}

	public void setReasonForAbsence(int reasonForAbsence) {
		this.reasonForAbsence = reasonForAbsence;
	}

	public int getMonthOfAbsence() {
		return monthOfAbsence;
	}

	public void setMonthOfAbsence(int monthOfAbsence) {
		this.monthOfAbsence = monthOfAbsence;
	}

	public int getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(int dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public int getTransportationExpense() {
		return transportationExpense;
	}

	public void setTransportationExpense(int transportationExpense) {
		this.transportationExpense = transportationExpense;
	}

	public int getDistanceFromResidenceToWork() {
		return distanceFromResidenceToWork;
	}

	public void setDistanceFromResidenceToWork(int distanceFromResidenceToWork) {
		this.distanceFromResidenceToWork = distanceFromResidenceToWork;
	}

	public int getServiceTime() {
		return serviceTime;
	}

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkLoadAverageByDay() {
		return workLoadAverageByDay;
	}

	public void setWorkLoadAverageByDay(int workLoadAverageByDay) {
		this.workLoadAverageByDay = workLoadAverageByDay;
	}

	public int getHitTarget() {
		return hitTarget;
	}

	public void setHitTarget(int hitTarget) {
		this.hitTarget = hitTarget;
	}

	public int getDisciplinaryFailure() {
		return disciplinaryFailure;
	}

	public void setDisciplinaryFailure(int disciplinaryFailure) {
		this.disciplinaryFailure = disciplinaryFailure;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public int getSon() {
		return son;
	}

	public void setSon(int son) {
		this.son = son;
	}

	public int getSocialDrinker() {
		return socialDrinker;
	}

	public void setSocialDrinker(int socialDrinker) {
		this.socialDrinker = socialDrinker;
	}

	public int getSocialSmoker() {
		return socialSmoker;
	}

	public void setSocialSmoker(int socialSmoker) {
		this.socialSmoker = socialSmoker;
	}

	public int getPet() {
		return pet;
	}

	public void setPet(int pet) {
		this.pet = pet;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBodyMassIndex() {
		return bodyMassIndex;
	}

	public void setBodyMassIndex(int bodyMassIndex) {
		this.bodyMassIndex = bodyMassIndex;
	}

	public int getSbsenteeismTimeInHours() {
		return sbsenteeismTimeInHours;
	}

	public void setSbsenteeismTimeInHours(int sbsenteeismTimeInHours) {
		this.sbsenteeismTimeInHours = sbsenteeismTimeInHours;
	}
}
