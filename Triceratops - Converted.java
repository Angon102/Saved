// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Triceratops - Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "triceratops_- converted"), "main");
	private final ModelPart main;
	private final ModelPart head;
	private final ModelPart top;
	private final ModelPart bone;
	private final ModelPart jaw;
	private final ModelPart mouth;
	private final ModelPart horns;
	private final ModelPart body;
	private final ModelPart front;
	private final ModelPart middle;
	private final ModelPart tail;
	private final ModelPart tail_part_1;
	private final ModelPart tail_part2;
	private final ModelPart tail_part3;
	private final ModelPart tail_part4;
	private final ModelPart tail_part5;
	private final ModelPart neck;
	private final ModelPart back;
	private final ModelPart leg;
	private final ModelPart right_leg_1;
	private final ModelPart right_leg_1_part1;
	private final ModelPart right_leg_1_part2;
	private final ModelPart right_leg_1_part3;
	private final ModelPart left_leg_1;
	private final ModelPart left_leg_1_part1;
	private final ModelPart left_leg_1_part2;
	private final ModelPart left_leg_1_part3;
	private final ModelPart left_leg_2;
	private final ModelPart left_leg_2_part_1;
	private final ModelPart left_leg_2_part_2;
	private final ModelPart left_leg_part_3;
	private final ModelPart right_leg_2;
	private final ModelPart right_leg_2_part_1;
	private final ModelPart right_leg_2_part_2;
	private final ModelPart right_leg_2_part_4;

	public Triceratops - Converted(ModelPart root) {
		this.main = root.getChild("main");
		this.head = this.main.getChild("head");
		this.top = this.head.getChild("top");
		this.bone = this.top.getChild("bone");
		this.jaw = this.head.getChild("jaw");
		this.mouth = this.head.getChild("mouth");
		this.horns = this.head.getChild("horns");
		this.body = this.main.getChild("body");
		this.front = this.body.getChild("front");
		this.middle = this.body.getChild("middle");
		this.tail = this.body.getChild("tail");
		this.tail_part_1 = this.tail.getChild("tail_part_1");
		this.tail_part2 = this.tail_part_1.getChild("tail_part2");
		this.tail_part3 = this.tail_part2.getChild("tail_part3");
		this.tail_part4 = this.tail_part3.getChild("tail_part4");
		this.tail_part5 = this.tail_part4.getChild("tail_part5");
		this.neck = this.body.getChild("neck");
		this.back = this.body.getChild("back");
		this.leg = this.main.getChild("leg");
		this.right_leg_1 = this.leg.getChild("right_leg_1");
		this.right_leg_1_part1 = this.right_leg_1.getChild("right_leg_1_part1");
		this.right_leg_1_part2 = this.right_leg_1_part1.getChild("right_leg_1_part2");
		this.right_leg_1_part3 = this.right_leg_1_part2.getChild("right_leg_1_part3");
		this.left_leg_1 = this.leg.getChild("left_leg_1");
		this.left_leg_1_part1 = this.left_leg_1.getChild("left_leg_1_part1");
		this.left_leg_1_part2 = this.left_leg_1_part1.getChild("left_leg_1_part2");
		this.left_leg_1_part3 = this.left_leg_1_part2.getChild("left_leg_1_part3");
		this.left_leg_2 = this.leg.getChild("left_leg_2");
		this.left_leg_2_part_1 = this.left_leg_2.getChild("left_leg_2_part_1");
		this.left_leg_2_part_2 = this.left_leg_2_part_1.getChild("left_leg_2_part_2");
		this.left_leg_part_3 = this.left_leg_2_part_2.getChild("left_leg_part_3");
		this.right_leg_2 = this.leg.getChild("right_leg_2");
		this.right_leg_2_part_1 = this.right_leg_2.getChild("right_leg_2_part_1");
		this.right_leg_2_part_2 = this.right_leg_2_part_1.getChild("right_leg_2_part_2");
		this.right_leg_2_part_4 = this.right_leg_2_part_2.getChild("right_leg_2_part_4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition main = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -28.0F));

		PartDefinition head = main.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top = head.addOrReplaceChild("top", CubeListBuilder.create().texOffs(16, 186).addBox(-1.0F, -13.0294F, 2.4336F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(178, 106).addBox(-2.0F, 8.3808F, 9.3401F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 59.0F));

		PartDefinition cube_r1 = top.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 174).addBox(-2.0F, -5.0F, -4.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -5.5653F, 6.4336F, 0.8213F, -0.8189F, -0.6654F));

		PartDefinition cube_r2 = top.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(170, 164).addBox(-2.0F, -4.0F, -6.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.0294F, 4.4336F, 0.0F, -0.9599F, 0.0F));

		PartDefinition cube_r3 = top.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(100, 164).addBox(-2.0F, -3.0F, -7.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -13.0294F, 4.4336F, -0.3688F, -0.9269F, 0.2998F));

		PartDefinition cube_r4 = top.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(82, 163).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(9.6095F, -15.9498F, -5.2821F, 0.1921F, -0.6104F, 0.2035F));

		PartDefinition cube_r5 = top.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 148).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9999F, -8.2225F, -6.1601F, 1.2217F, -0.7418F, 0.0F));

		PartDefinition cube_r6 = top.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(100, 175).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(10.3229F, -5.1163F, -6.5126F, 1.6144F, -0.7418F, 0.0F));

		PartDefinition cube_r7 = top.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(172, 34).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.6289F, -1.0407F, -5.6247F, 1.9491F, -0.7013F, 0.0219F));

		PartDefinition cube_r8 = top.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 145).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.9093F, -4.41F, -2.6882F, 0.3054F, -0.5672F, 0.0F));

		PartDefinition cube_r9 = top.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(52, 170).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.5878F, 0.4064F, 0.0841F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r10 = top.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(68, 170).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6289F, -1.0407F, -5.6247F, 1.9491F, 0.7013F, -0.0219F));

		PartDefinition cube_r11 = top.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 174).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-10.3229F, -5.1163F, -6.5126F, 1.6144F, 0.7418F, 0.0F));

		PartDefinition cube_r12 = top.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(62, 146).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9999F, -8.2225F, -6.1601F, 1.2217F, 0.7418F, 0.0F));

		PartDefinition cube_r13 = top.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(118, 169).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-5.5878F, 0.4064F, 0.0841F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r14 = top.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 163).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-9.6095F, -15.9498F, -5.2821F, 0.1921F, 0.6104F, -0.2035F));

		PartDefinition cube_r15 = top.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(138, 144).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 11.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-6.9093F, -4.41F, -2.6882F, 0.3054F, 0.5672F, 0.0F));

		PartDefinition cube_r16 = top.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(74, 111).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.186F, 13.0845F, 11.4673F, -0.5996F, -0.1245F, -0.1796F));

		PartDefinition cube_r17 = top.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(158, 91).addBox(-6.0F, -0.5F, 0.5F, 10.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.1501F, 1.5814F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r18 = top.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(124, 87).addBox(-7.0F, -2.5F, -3.5F, 12.0F, 6.0F, 5.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(1.0F, 1.1501F, -1.4185F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r19 = top.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(138, 162).addBox(-1.0F, -9.5F, -0.5F, 5.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(40, 146).addBox(-4.0F, -9.5F, -0.5F, 8.0F, 10.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.0398F, 6.0155F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r20 = top.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(138, 26).addBox(-2.5F, -2.0F, -2.5F, 8.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 3.7484F, -5.7827F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r21 = top.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(154, 106).addBox(-2.5F, -2.0F, -2.5F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 4.8346F, -3.3142F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r22 = top.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(90, 134).addBox(-4.0F, -9.5F, -1.5F, 8.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0398F, 2.0155F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r23 = top.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(62, 161).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.5827F, 7.5573F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r24 = top.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(94, 23).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.8318F, 11.1187F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r25 = top.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(94, 27).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.186F, 13.0845F, 11.4673F, -0.5996F, 0.1245F, 0.1796F));

		PartDefinition cube_r26 = top.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(94, 19).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 14.1441F, 10.1162F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r27 = top.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(94, 15).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 14.1441F, 10.1162F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r28 = top.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(116, 11).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 12.5058F, 11.2633F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r29 = top.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(66, 182).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 10.9785F, 12.0584F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r30 = top.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(180, 159).addBox(-1.5F, -1.5F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(22, 141).addBox(-0.5F, -1.5F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 5.7179F, 16.6097F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r31 = top.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(172, 46).addBox(-1.5F, -1.5F, -2.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 4.3928F, 16.6286F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r32 = top.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(160, 97).addBox(-1.5F, -2.5F, -4.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0001F)), PartPose.offsetAndRotation(-0.5F, 7.8412F, 14.0731F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r33 = top.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(142, 82).addBox(-2.5F, -1.5F, -1.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.8412F, 14.0731F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r34 = top.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(168, 136).addBox(-2.5F, -1.5F, -3.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, 4.6134F, 12.9667F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r35 = top.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 129).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.0773F, 16.0948F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r36 = top.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(40, 159).addBox(-3.0F, -1.5F, -4.0F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 7.0773F, 12.0948F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = top.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(38, 76).addBox(0.0F, -3.0F, -7.0F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -13.0294F, 4.4336F, -0.3688F, 0.9269F, -0.2998F));

		PartDefinition cube_r38 = top.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(186, 18).addBox(0.0F, -3.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -13.0294F, 4.4336F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r39 = top.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(168, 69).addBox(0.0F, -4.0F, -6.0F, 2.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -9.0294F, 4.4336F, 0.0F, 0.9599F, 0.0F));

		PartDefinition cube_r40 = top.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(174, 11).addBox(0.0F, -5.0F, -4.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.5653F, 6.4336F, 0.8213F, 0.8189F, 0.6654F));

		PartDefinition cube_r41 = top.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(186, 11).addBox(0.0F, -4.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.5653F, 6.4336F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r42 = top.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(8, 186).addBox(0.0F, -5.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.8789F, 9.8115F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r43 = top.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(26, 185).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6653F, 9.9756F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r44 = top.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(156, 159).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3553F, 6.7975F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r45 = top.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(80, 109).addBox(-5.0F, -5.0F, -3.5F, 10.0F, 8.0F, 7.0F, new CubeDeformation(-0.0001F)), PartPose.offsetAndRotation(0.0F, 4.9765F, 8.2314F, 0.6109F, 0.0F, 0.0F));

		PartDefinition bone = top.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.0F, 1.1501F, 3.5814F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(102, 60).addBox(-7.0F, -2.5F, -3.5F, 12.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 9.1993F, 63.1536F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(184, 65).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5041F, 0.5617F, 0.9351F, 0.4549F, 0.1586F, -0.3123F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(184, 56).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5041F, 0.5617F, 0.9351F, 0.4549F, 0.1586F, -0.3123F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(144, 106).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 2.3985F, 3.7635F, 1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(134, 106).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3985F, 4.7635F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(124, 106).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 4.9368F, 3.6891F, 1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(164, 182).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3946F, 2.7555F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(182, 88).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0573F, 1.4966F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 183).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5041F, 0.5617F, 0.9351F, 0.4549F, -0.1586F, 0.3123F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(126, 180).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5041F, 0.5617F, 0.9351F, 0.4549F, -0.1586F, 0.3123F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(134, 175).addBox(-2.0F, -3.0F, -1.5F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5724F, -0.1377F, 0.48F, 0.0F, 0.0F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(-1.5041F, 8.7609F, 63.0887F));

		PartDefinition cube_r57 = mouth.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(154, 164).addBox(-0.9959F, -3.0F, -1.5F, 1.0F, 6.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.0F, 0.7543F, 0.2443F, -0.2519F));

		PartDefinition cube_r58 = mouth.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(164, 114).addBox(-0.0041F, -3.0F, -1.5F, 1.0F, 6.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.0082F, 1.0F, 1.0F, 0.7543F, -0.2443F, 0.2519F));

		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r59 = horns.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(52, 181).addBox(-1.0F, 0.367F, 2.1587F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r60 = horns.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(180, 118).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.6766F, -5.2802F, 80.6251F, 0.0436F, 0.1745F, 0.0F));

		PartDefinition cube_r61 = horns.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(146, 184).addBox(-1.0F, -0.2383F, -1.5611F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.3054F, 0.1745F, 0.0F));

		PartDefinition cube_r62 = horns.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(134, 184).addBox(-1.0F, -0.9794F, -1.3221F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.4363F, 0.1745F, 0.0F));

		PartDefinition cube_r63 = horns.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(102, 153).addBox(-1.0F, -1.6504F, -10.1164F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r64 = horns.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(138, 117).addBox(-1.0F, -1.2882F, -12.0236F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(5.0F, -6.3496F, 71.1164F, -0.1745F, 0.1745F, 0.0F));

		PartDefinition cube_r65 = horns.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(180, 112).addBox(-1.0F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.6766F, -5.2802F, 80.6251F, 0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r66 = horns.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(112, 180).addBox(-1.0F, 0.367F, 2.1587F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.0436F, -0.1745F, 0.0F));

		PartDefinition cube_r67 = horns.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(184, 74).addBox(-1.0F, -0.9794F, -1.3221F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.4363F, -0.1745F, 0.0F));

		PartDefinition cube_r68 = horns.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(102, 148).addBox(-1.0F, -0.2383F, -1.5611F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.3054F, -0.1745F, 0.0F));

		PartDefinition cube_r69 = horns.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(144, 70).addBox(-1.0F, -1.2882F, -11.0236F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, -0.1745F, -0.1745F, 0.0F));

		PartDefinition cube_r70 = horns.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(152, 0).addBox(-1.0F, -1.6504F, -10.1164F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-5.0F, -6.3496F, 71.1164F, 0.0F, -0.1745F, 0.0F));

		PartDefinition body = main.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition front = body.addOrReplaceChild("front", CubeListBuilder.create().texOffs(0, 34).addBox(-9.0F, -13.0F, -8.0F, 18.0F, 19.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(36, 111).addBox(-6.0F, 5.1956F, -8.0F, 12.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(38, 87).addBox(-7.0F, -11.0F, -2.0F, 14.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 43.0F));

		PartDefinition cube_r71 = front.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(102, 74).addBox(-1.0F, 1.0F, -4.0F, 16.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 121).addBox(0.0F, 0.0F, -4.0F, 14.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -14.9851F, -4.8736F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r72 = front.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(102, 81).addBox(-5.0F, 1.0F, -4.0F, 16.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(138, 19).addBox(-4.0F, 0.0F, -4.0F, 14.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -13.7822F, -1.0587F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r73 = front.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(138, 37).addBox(-3.0F, 1.0F, -6.0F, 12.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(138, 136).addBox(-2.0F, 0.0F, -6.0F, 10.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(170, 51).addBox(-1.0F, 0.0F, -1.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -11.4861F, 4.4846F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r74 = front.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(138, 130).addBox(-6.0F, -1.0F, -2.0F, 12.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0365F, 2.7642F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r75 = front.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(138, 51).addBox(-6.0F, -1.0F, -2.0F, 12.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0251F, -0.6276F, 0.0873F, 0.0F, 0.0F));

		PartDefinition middle = body.addOrReplaceChild("middle", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -13.8044F, -5.0F, 20.0F, 23.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(52, 34).addBox(-9.0F, -15.8044F, -11.0F, 18.0F, 22.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(114, 109).addBox(-7.0F, -17.0429F, -10.9293F, 14.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 29.0F));

		PartDefinition cube_r76 = middle.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(124, 98).addBox(-5.0F, -2.0F, -6.0F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.1956F, -5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r77 = middle.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 62).addBox(-9.0F, -0.5F, -5.5F, 18.0F, 3.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(62, 0).addBox(-8.0F, -1.5F, -5.5F, 16.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.3044F, 0.5F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail_part_1 = tail.addOrReplaceChild("tail_part_1", CubeListBuilder.create().texOffs(80, 87).addBox(-7.0F, -7.0F, -4.0F, 14.0F, 14.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -4.0F, 4.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail_part2 = tail_part_1.addOrReplaceChild("tail_part2", CubeListBuilder.create().texOffs(0, 106).addBox(-5.0F, -6.0F, -4.0F, 10.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -8.0F));

		PartDefinition tail_part3 = tail_part2.addOrReplaceChild("tail_part3", CubeListBuilder.create().texOffs(62, 15).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -8.0F));

		PartDefinition tail_part4 = tail_part3.addOrReplaceChild("tail_part4", CubeListBuilder.create().texOffs(30, 129).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(186, 34).addBox(-1.0F, 4.0F, 20.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -8.0F));

		PartDefinition tail_part5 = tail_part4.addOrReplaceChild("tail_part5", CubeListBuilder.create().texOffs(114, 140).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -8.0F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(124, 153).addBox(-1.0F, -6.8421F, 1.3113F, 2.0F, 11.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(100, 39).addBox(-5.0F, -6.8421F, -3.6887F, 10.0F, 12.0F, 9.0F, new CubeDeformation(0.0001F))
		.texOffs(180, 80).addBox(-1.0F, 4.1579F, 1.3113F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 51.0F));

		PartDefinition cube_r78 = neck.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 168).addBox(0.5F, -5.5F, -2.5F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1424F, 8.8908F, 0.1443F, -0.4323F, -0.0608F));

		PartDefinition cube_r79 = neck.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(182, 93).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7463F, -2.5034F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r80 = neck.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(128, 11).addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.9104F, -0.0411F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r81 = neck.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(172, 143).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6579F, -0.1887F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r82 = neck.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(38, 167).addBox(-3.5F, -5.5F, -2.5F, 3.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1424F, 8.8908F, 0.1443F, 0.4323F, 0.0608F));

		PartDefinition cube_r83 = neck.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(156, 144).addBox(-1.5F, -5.5F, -2.5F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1424F, 9.8908F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(0, 126).addBox(-5.5F, -5.5F, -2.5F, 11.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.1424F, 6.8908F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r85 = neck.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(116, 0).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 1.0F, 10.0F, new CubeDeformation(0.001F))
		.texOffs(58, 134).addBox(-3.0F, -1.0F, -5.0F, 6.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8421F, 1.3113F, -0.1309F, 0.0F, 0.0F));

		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(100, 15).addBox(-8.0F, -15.0F, 1.0F, 16.0F, 21.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(58, 62).addBox(-7.0F, -11.0F, -7.0F, 14.0F, 17.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(138, 44).addBox(-6.0F, 4.7299F, -6.7345F, 12.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 14.0F));

		PartDefinition cube_r86 = back.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(138, 11).addBox(-5.0F, -0.5634F, -6.9629F, 12.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.5983F, 5.2844F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r87 = back.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(74, 124).addBox(-6.0F, -1.0F, -4.5F, 11.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, -0.5F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leg = main.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_leg_1 = leg.addOrReplaceChild("right_leg_1", CubeListBuilder.create(), PartPose.offset(-11.0F, 4.0F, 43.0F));

		PartDefinition right_leg_1_part1 = right_leg_1.addOrReplaceChild("right_leg_1_part1", CubeListBuilder.create(), PartPose.offset(2.0F, -1.0F, 1.0F));

		PartDefinition cube_r88 = right_leg_1_part1.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(158, 82).addBox(-3.0F, -3.5F, -2.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3087F, -4.9154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r89 = right_leg_1_part1.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(148, 177).addBox(-3.0F, -3.5F, -1.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.3087F, -1.9154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r90 = right_leg_1_part1.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(168, 26).addBox(-2.0F, 0.0F, 0.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.1105F, -3.6381F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r91 = right_leg_1_part1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(172, 152).addBox(-2.0F, 0.0F, -1.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.4592F, 0.3467F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r92 = right_leg_1_part1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(170, 127).addBox(-2.0F, 0.0F, -1.0F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.9759F, 3.5201F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r93 = right_leg_1_part1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(82, 174).addBox(-3.0F, -3.0F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.4989F, -5.5471F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r94 = right_leg_1_part1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(0, 156).addBox(-3.0F, -4.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7375F, -1.1593F, -0.5672F, 0.0F, 0.0F));

		PartDefinition right_leg_1_part2 = right_leg_1_part1.addOrReplaceChild("right_leg_1_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -4.0F));

		PartDefinition cube_r95 = right_leg_1_part2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(174, 0).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.9397F, 2.342F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r96 = right_leg_1_part2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(168, 57).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_leg_1_part3 = right_leg_1_part2.addOrReplaceChild("right_leg_1_part3", CubeListBuilder.create().texOffs(170, 175).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(180, 97).addBox(-2.0F, 0.8978F, -1.2235F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(82, 180).addBox(-2.0F, 2.8978F, -1.2235F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 2.0F));

		PartDefinition cube_r97 = right_leg_1_part3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(178, 182).addBox(-2.0F, -2.5F, -1.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3978F, 2.2765F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r98 = right_leg_1_part3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(38, 182).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1901F, -0.6458F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg_1 = leg.addOrReplaceChild("left_leg_1", CubeListBuilder.create(), PartPose.offset(11.0F, 4.0F, 43.0F));

		PartDefinition left_leg_1_part1 = left_leg_1.addOrReplaceChild("left_leg_1_part1", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 1.0F));

		PartDefinition cube_r99 = left_leg_1_part1.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(158, 82).mirror().addBox(-3.0F, -3.5F, -2.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3087F, -4.9154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r100 = left_leg_1_part1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(148, 177).mirror().addBox(-3.0F, -3.5F, -1.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 8.3087F, -1.9154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r101 = left_leg_1_part1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(168, 26).mirror().addBox(-4.0F, 0.0F, 0.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.1105F, -3.6381F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r102 = left_leg_1_part1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(172, 152).mirror().addBox(-4.0F, 0.0F, -1.0F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -1.4592F, 0.3467F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r103 = left_leg_1_part1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(170, 127).mirror().addBox(-4.0F, 0.0F, -1.0F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.9759F, 3.5201F, -2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r104 = left_leg_1_part1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(82, 174).mirror().addBox(-3.0F, -3.0F, -1.0F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.4989F, -5.5471F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r105 = left_leg_1_part1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 156).mirror().addBox(-3.0F, -4.0F, -1.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7375F, -1.1593F, -0.5672F, 0.0F, 0.0F));

		PartDefinition left_leg_1_part2 = left_leg_1_part1.addOrReplaceChild("left_leg_1_part2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -4.0F));

		PartDefinition cube_r106 = left_leg_1_part2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(174, 0).mirror().addBox(-2.0F, -4.0F, -2.0F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.9397F, 2.342F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r107 = left_leg_1_part2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(168, 57).mirror().addBox(-2.0F, -3.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_leg_1_part3 = left_leg_1_part2.addOrReplaceChild("left_leg_1_part3", CubeListBuilder.create().texOffs(170, 175).mirror().addBox(-2.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(180, 97).mirror().addBox(-2.0F, 0.8978F, -1.2235F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(82, 180).mirror().addBox(-2.0F, 2.8978F, -1.2235F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 10.0F, 2.0F));

		PartDefinition cube_r108 = left_leg_1_part3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(178, 182).mirror().addBox(-2.0F, -2.5F, -1.5F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.3978F, 2.2765F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = left_leg_1_part3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(38, 182).mirror().addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.1901F, -0.6458F, 0.2618F, 0.0F, 0.0F));

		PartDefinition left_leg_2 = leg.addOrReplaceChild("left_leg_2", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, 16.0F));

		PartDefinition cube_r110 = left_leg_2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 76).addBox(-4.5F, -4.5F, -5.5F, 7.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -2.4323F, -1.844F, 0.3927F, 0.0F, 0.0F));

		PartDefinition left_leg_2_part_1 = left_leg_2.addOrReplaceChild("left_leg_2_part_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -16.0F));

		PartDefinition left_leg_2_part_2 = left_leg_2_part_1.addOrReplaceChild("left_leg_2_part_2", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 20.0F));

		PartDefinition cube_r111 = left_leg_2_part_2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(114, 117).addBox(-2.5F, -8.5F, -3.5F, 5.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.621F, -1.8136F, -0.3491F, 0.0F, 0.0F));

		PartDefinition left_leg_part_3 = left_leg_2_part_2.addOrReplaceChild("left_leg_part_3", CubeListBuilder.create().texOffs(144, 57).addBox(-2.0F, -1.4411F, -2.6696F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, -5.0F));

		PartDefinition right_leg_2 = leg.addOrReplaceChild("right_leg_2", CubeListBuilder.create(), PartPose.offset(-8.0F, 0.0F, 16.0F));

		PartDefinition cube_r112 = right_leg_2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-2.5F, -4.5F, -5.5F, 7.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -2.4323F, -1.844F, 0.3927F, 0.0F, 0.0F));

		PartDefinition right_leg_2_part_1 = right_leg_2.addOrReplaceChild("right_leg_2_part_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -16.0F));

		PartDefinition right_leg_2_part_2 = right_leg_2_part_1.addOrReplaceChild("right_leg_2_part_2", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 20.0F));

		PartDefinition cube_r113 = right_leg_2_part_2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(114, 117).mirror().addBox(-2.5F, -8.5F, -3.5F, 5.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.621F, -1.8136F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_leg_2_part_4 = right_leg_2_part_2.addOrReplaceChild("right_leg_2_part_4", CubeListBuilder.create().texOffs(144, 57).mirror().addBox(-3.0F, -1.4411F, -2.6696F, 5.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 11.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}