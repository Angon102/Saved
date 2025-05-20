// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Triceratops<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "triceratops"), "main");
	private final ModelPart main;
	private final ModelPart head;
	private final ModelPart top;
	private final ModelPart jaw;
	private final ModelPart horns;
	private final ModelPart body;
	private final ModelPart front;
	private final ModelPart middle;
	private final ModelPart tail;
	private final ModelPart tail_part_1;
	private final ModelPart tail_part2;
	private final ModelPart tail_part3;
	private final ModelPart tail_part4;
	private final ModelPart Neck;
	private final ModelPart leg;
	private final ModelPart leg1;
	private final ModelPart leg1_part1;
	private final ModelPart leg1_part2;
	private final ModelPart leg1_part3;
	private final ModelPart leg2;
	private final ModelPart leg2_part1;
	private final ModelPart leg2_part2;
	private final ModelPart leg2_part3;
	private final ModelPart leg3;
	private final ModelPart leg3_part1;
	private final ModelPart leg3_part2;
	private final ModelPart leg3_part3;
	private final ModelPart leg4;
	private final ModelPart leg4_part1;
	private final ModelPart leg4_part2;
	private final ModelPart leg4_part3;

	public Triceratops(ModelPart root) {
		this.main = root.getChild("main");
		this.head = root.getChild("head");
		this.top = root.getChild("top");
		this.jaw = root.getChild("jaw");
		this.horns = root.getChild("horns");
		this.body = root.getChild("body");
		this.front = root.getChild("front");
		this.middle = root.getChild("middle");
		this.tail = root.getChild("tail");
		this.tail_part_1 = root.getChild("tail_part_1");
		this.tail_part2 = root.getChild("tail_part2");
		this.tail_part3 = root.getChild("tail_part3");
		this.tail_part4 = root.getChild("tail_part4");
		this.Neck = root.getChild("Neck");
		this.leg = root.getChild("leg");
		this.leg1 = root.getChild("leg1");
		this.leg1_part1 = root.getChild("leg1_part1");
		this.leg1_part2 = root.getChild("leg1_part2");
		this.leg1_part3 = root.getChild("leg1_part3");
		this.leg2 = root.getChild("leg2");
		this.leg2_part1 = root.getChild("leg2_part1");
		this.leg2_part2 = root.getChild("leg2_part2");
		this.leg2_part3 = root.getChild("leg2_part3");
		this.leg3 = root.getChild("leg3");
		this.leg3_part1 = root.getChild("leg3_part1");
		this.leg3_part2 = root.getChild("leg3_part2");
		this.leg3_part3 = root.getChild("leg3_part3");
		this.leg4 = root.getChild("leg4");
		this.leg4_part1 = root.getChild("leg4_part1");
		this.leg4_part2 = root.getChild("leg4_part2");
		this.leg4_part3 = root.getChild("leg4_part3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, -28.0F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top = head.addOrReplaceChild("top", CubeListBuilder.create().texOffs(-3, -2).addBox(-2.0F, 6.3808F, 68.3401F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = top.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-2, -2).mirror().addBox(-2.0F, -5.0F, -4.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -7.5653F, 65.4336F, 0.8213F, -0.8189F, -0.6654F));

		PartDefinition cube_r2 = top.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-4, -4).mirror().addBox(-2.0F, -4.0F, -6.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -11.0294F, 63.4336F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r3 = top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-5, -5).mirror().addBox(-2.0F, -3.0F, -7.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -15.0294F, 63.4336F, -0.3688F, -0.9269F, 0.2998F));

		PartDefinition cube_r4 = top.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-5, -5).mirror().addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(9.6094F, -17.9498F, 53.7179F, 0.1921F, -0.6104F, 0.2035F));

		PartDefinition cube_r5 = top.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-6, -6).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.9999F, -10.2225F, 52.8399F, 1.2217F, -0.7418F, 0.0F));

		PartDefinition cube_r6 = top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-2, -2).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(10.3229F, -7.1163F, 52.4874F, 1.6144F, -0.7418F, 0.0F));

		PartDefinition cube_r7 = top.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-3, -3).mirror().addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.6289F, -3.0407F, 53.3753F, 1.9491F, -0.7013F, 0.0219F));

		PartDefinition cube_r8 = top.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-5, -5).mirror().addBox(-1.0F, -7.0F, -1.0F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(6.9092F, -6.41F, 56.3118F, 0.3054F, -0.5672F, 0.0F));

		PartDefinition cube_r9 = top.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-4, -4).mirror().addBox(-1.0F, -4.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(5.5878F, -1.5936F, 59.0841F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r10 = top.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6289F, -3.0407F, 53.3753F, 1.9491F, 0.7013F, -0.0219F));

		PartDefinition cube_r11 = top.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-10.3229F, -7.1163F, 52.4874F, 1.6144F, 0.7418F, 0.0F));

		PartDefinition cube_r12 = top.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-6, -6).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9999F, -10.2225F, 52.8399F, 1.2217F, 0.7418F, 0.0F));

		PartDefinition cube_r13 = top.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-4, -4).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-5.5878F, -1.5936F, 59.0841F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r14 = top.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-5, -5).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-9.6094F, -17.9498F, 53.7179F, 0.1921F, 0.6104F, -0.2035F));

		PartDefinition cube_r15 = top.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-5, -5).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-6.9092F, -6.41F, 56.3118F, 0.3054F, 0.5672F, 0.0F));

		PartDefinition cube_r16 = top.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(2, 1).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.186F, 11.0844F, 70.4673F, -0.5996F, -0.1245F, -0.1796F));

		PartDefinition cube_r17 = top.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-4, 0).mirror().addBox(-6.0F, -0.5F, 0.5F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.8499F, 60.5814F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r18 = top.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-8, -3).mirror().addBox(-7.0F, -2.5F, -3.5F, 12.0F, 6.0F, 5.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.8499F, 57.5814F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r19 = top.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-12, -7).mirror().addBox(-7.0F, -2.5F, -3.5F, 12.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.8499F, 62.5814F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r20 = top.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-4, -1).mirror().addBox(-1.0F, -9.5F, -0.5F, 5.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-4, -1).addBox(-4.0F, -9.5F, -0.5F, 8.0F, 10.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.0398F, 65.0155F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r21 = top.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-8, -5).addBox(-2.5F, -2.0F, -2.5F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 1.7484F, 53.2173F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r22 = top.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-5, -2).addBox(-2.5F, -2.0F, -2.5F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 2.8346F, 55.6858F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r23 = top.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-5, -2).addBox(-4.0F, -9.5F, -1.5F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0398F, 61.0155F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r24 = top.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(-4, -2).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.5827F, 66.5573F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r25 = top.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.8318F, 70.1187F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r26 = top.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.186F, 11.0844F, 70.4673F, -0.5996F, 0.1245F, 0.1796F));

		PartDefinition cube_r27 = top.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 12.1441F, 69.1162F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r28 = top.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(1, 1).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.1441F, 69.1162F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r29 = top.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 10.5058F, 70.2633F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r30 = top.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(-2, -1).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 8.9785F, 71.0584F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r31 = top.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(-2, -1).addBox(-1.5F, -1.5F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.5F, -1.5F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 3.7179F, 75.6097F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r32 = top.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(-2, -1).addBox(-1.5F, -1.5F, -2.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 2.3928F, 75.6286F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r33 = top.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(-5, -4).addBox(-1.5F, -2.5F, -4.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(-0.5F, 5.8412F, 73.0731F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r34 = top.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(-2, 0).addBox(-2.5F, -1.5F, -1.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.8412F, 73.0731F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r35 = top.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(-4, -2).addBox(-2.5F, -1.5F, -3.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(-0.5F, 2.6134F, 71.9667F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = top.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(-2, 0).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 4.0773F, 75.0948F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = top.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(-5, -3).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0773F, 71.0948F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r38 = top.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(-5, -5).addBox(0.0F, -3.0F, -7.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -15.0294F, 63.4336F, -0.3688F, 0.9269F, -0.2998F));

		PartDefinition cube_r39 = top.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -3.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -15.0294F, 63.4336F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r40 = top.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(-4, -4).addBox(0.0F, -4.0F, -6.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -11.0294F, 63.4336F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r41 = top.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -11.0294F, 63.4336F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r42 = top.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(-2, -2).addBox(0.0F, -5.0F, -4.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.5653F, 65.4336F, 0.8213F, 0.8189F, 0.6654F));

		PartDefinition cube_r43 = top.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -4.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.5653F, 65.4336F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r44 = top.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -3.8789F, 68.8116F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r45 = top.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3347F, 68.9756F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r46 = top.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(-5, -2).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6447F, 65.7975F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r47 = top.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(-9, -5).addBox(-5.0F, -5.0F, -3.5F, 10.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.9765F, 67.2314F, 0.6109F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.1993F, 63.1536F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(1, -1).mirror().addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5041F, 0.5617F, 0.9351F, 0.4549F, 0.1586F, -0.3123F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(1, -1).mirror().addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5041F, 0.5617F, 0.9351F, 0.4549F, 0.1586F, -0.3123F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.3985F, 3.7635F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 1).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3985F, 4.7635F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 1).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.9368F, 3.6891F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(-2, -1).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3946F, 2.7555F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(-2, -1).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0573F, 1.4966F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(1, -1).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5041F, 0.5617F, 0.9351F, 0.4549F, -0.1586F, 0.3123F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(1, -1).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5041F, 0.5617F, 0.9351F, 0.4549F, -0.1586F, 0.3123F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(-2, -1).addBox(-2.0F, -3.0F, -1.5F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5724F, -0.1377F, 0.48F, 0.0F, 0.0F));

		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r58 = horns.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(-3, -3).mirror().addBox(-1.0F, 0.367F, 2.1587F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r59 = horns.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(-3, -3).mirror().addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.6766F, -5.2802F, 80.6251F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r60 = horns.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(-2, -2).mirror().addBox(-1.0F, -0.2383F, -1.5611F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.3054F, 0.1745F, 0.0F));

		PartDefinition cube_r61 = horns.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(-2, -2).mirror().addBox(-1.0F, -0.9794F, -1.3221F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.4363F, 0.1745F, 0.0F));

		PartDefinition cube_r62 = horns.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(-7, -7).mirror().addBox(-1.0F, -1.6504F, -10.1164F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r63 = horns.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(-9, -9).mirror().addBox(-1.0F, -1.2882F, -12.0236F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.1745F, 0.1745F, 0.0F));

		PartDefinition cube_r64 = horns.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6766F, -5.2802F, 80.6251F, 0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r65 = horns.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.0F, 0.367F, 2.1587F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r66 = horns.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -0.9794F, -1.3221F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.4363F, -0.1745F, 0.0F));

		PartDefinition cube_r67 = horns.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -0.2383F, -1.5611F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.3054F, -0.1745F, 0.0F));

		PartDefinition cube_r68 = horns.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(-8, -8).addBox(-1.0F, -1.2882F, -11.0236F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.1745F, -0.1745F, 0.0F));

		PartDefinition cube_r69 = horns.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(-7, -7).addBox(-1.0F, -1.6504F, -10.1164F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition front = body.addOrReplaceChild("front", CubeListBuilder.create().texOffs(-13, -6).addBox(-8.0F, -13.0F, 35.0F, 16.0F, 19.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(-5, -5).addBox(-1.0F, 5.1956F, 35.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(-11, -5).addBox(-7.0F, -11.0F, 41.0F, 14.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r70 = front.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(-8, -4).addBox(-4.0F, 0.0F, -6.0F, 14.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -13.7822F, 41.9413F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r71 = front.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(-6, -3).addBox(-3.0F, 0.0F, -6.0F, 12.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 0).addBox(-1.0F, 0.0F, -1.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -11.4861F, 47.4846F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r72 = front.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0365F, 45.7642F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r73 = front.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0251F, 42.3724F, 0.0873F, 0.0F, 0.0F));

		PartDefinition middle = body.addOrReplaceChild("middle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_part_1 = tail.addOrReplaceChild("tail_part_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_part2 = tail_part_1.addOrReplaceChild("tail_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_part3 = tail_part2.addOrReplaceChild("tail_part3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_part4 = tail_part3.addOrReplaceChild("tail_part4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Neck = body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(-3, -3).addBox(-1.0F, -9.8421F, 52.3113F, 2.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(-11, -7).addBox(-5.0F, -9.8421F, 47.3113F, 10.0F, 12.0F, 9.0F, new CubeDeformation(0.0001F))
		.texOffs(-3, -3).addBox(-1.0F, 1.1579F, 52.3113F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r74 = Neck.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(-5, -2).mirror().addBox(0.5F, -5.5F, -2.5F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -4.1424F, 59.8908F, 0.1443F, -0.4323F, -0.0608F));

		PartDefinition cube_r75 = Neck.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.7463F, 48.4966F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r76 = Neck.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(-1, -1).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.9104F, 50.9589F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r77 = Neck.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(-4, -4).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6579F, 50.8113F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(-5, -2).addBox(-3.5F, -5.5F, -2.5F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.1424F, 59.8908F, 0.1443F, 0.4323F, 0.0608F));

		PartDefinition cube_r79 = Neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(-3, -2).addBox(-1.5F, -5.5F, -2.5F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.1424F, 60.8908F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(-7, -2).addBox(-5.5F, -5.5F, -2.5F, 11.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.1424F, 57.8908F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r81 = Neck.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(-11, -8).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.001F))
		.texOffs(-10, -8).addBox(-3.0F, -1.0F, -5.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.8421F, 52.3113F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leg = main.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1 = leg.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1_part1 = leg1.addOrReplaceChild("leg1_part1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1_part2 = leg1_part1.addOrReplaceChild("leg1_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg1_part3 = leg1_part2.addOrReplaceChild("leg1_part3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg2 = leg.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg2_part1 = leg2.addOrReplaceChild("leg2_part1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg2_part2 = leg2_part1.addOrReplaceChild("leg2_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg2_part3 = leg2_part2.addOrReplaceChild("leg2_part3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg3 = leg.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg3_part1 = leg3.addOrReplaceChild("leg3_part1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg3_part2 = leg3_part1.addOrReplaceChild("leg3_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg3_part3 = leg3_part2.addOrReplaceChild("leg3_part3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg4 = leg.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg4_part1 = leg4.addOrReplaceChild("leg4_part1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg4_part2 = leg4_part1.addOrReplaceChild("leg4_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leg4_part3 = leg4_part2.addOrReplaceChild("leg4_part3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}