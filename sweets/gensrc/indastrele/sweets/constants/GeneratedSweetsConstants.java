/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 2, 2025, 1:28:38 AM                     ---
 * ----------------------------------------------------------------
 */
package indastrele.sweets.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated(since = "ages", forRemoval = false)
@SuppressWarnings({"unused","cast"})
public class GeneratedSweetsConstants
{
	public static final String EXTENSIONNAME = "sweets";
	public static class TC
	{
		public static final String BOX = "Box".intern();
		public static final String CANDY = "Candy".intern();
		public static final String FLAVOR = "Flavor".intern();
		public static final String PACKAGESIZE = "PackageSize".intern();
		public static final String SUPPLIER = "Supplier".intern();
		public static final String SUPPLIERINFO = "SupplierInfo".intern();
	}
	public static class Attributes
	{
		public static class Box
		{
			public static final String CANDIES = "candies".intern();
			public static final String EXTRACANDIES = "extraCandies".intern();
			public static final String LABEL = "label".intern();
			public static final String LABELSMAP = "labelsMap".intern();
			public static final String PACKAGESIZE = "packageSize".intern();
			public static final String SUPPLIER = "supplier".intern();
			public static final String SUPPLIERPOS = "supplierPOS".intern();
		}
		public static class Candy
		{
			public static final String BOX = "box".intern();
			public static final String BOXPOS = "boxPOS".intern();
			public static final String CODE = "code".intern();
			public static final String FLAVOR = "flavor".intern();
			public static final String SUPPLIER = "supplier".intern();
		}
		public static class Supplier
		{
			public static final String BOXES = "boxes".intern();
			public static final String CODE = "code".intern();
			public static final String INFO = "info".intern();
			public static final String NAME = "name".intern();
			public static final String SUPPLIEDCANDIES = "suppliedCandies".intern();
		}
		public static class SupplierInfo
		{
			public static final String CODE = "code".intern();
			public static final String CONTACTEMAIL = "contactEmail".intern();
			public static final String CONTACTNAME = "contactName".intern();
			public static final String SUPPLIER = "supplier".intern();
		}
	}
	public static class Enumerations
	{
		public static class Flavor
		{
			public static final String SWEET = "SWEET".intern();
			public static final String BITTER = "BITTER".intern();
			public static final String SOUR = "SOUR".intern();
		}
		public static class PackageSize
		{
			public static final String SMALL = "SMALL".intern();
			public static final String MEDIUM = "MEDIUM".intern();
			public static final String LARGE = "LARGE".intern();
		}
	}
	public static class Relations
	{
		public static final String BOX2CANDYREL = "Box2CandyRel".intern();
		public static final String SUPPLIER2BOXREL = "Supplier2BoxRel".intern();
		public static final String SUPPLIER2CANDYREL = "Supplier2CandyRel".intern();
	}
	
	protected GeneratedSweetsConstants()
	{
		// private constructor
	}
	
	
}
