
class CopyrightModel {

	public String licence_url;
	public String holder;
	public int year;
	public String holder_url;
	public String licence;
	public String logo;

	public CopyrightModel(String licence_url, String holder, int year, String holder_url, String licence, String logo) {

		this.licence_url = licence_url;
		this.holder = holder;
		this.year = year;
		this.holder_url = holder_url;
		this.licence = licence;
		this.logo = logo;

	}

}