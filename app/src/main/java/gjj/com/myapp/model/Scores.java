package gjj.com.myapp.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by ${高娟娟} on 2016/4/30.
 * 答辩教师评分表，用于保存老师给学生打的分数
 */
@Entity
public class Scores {
    @Id(autoincrement = true)
    private Long id;
    //课题id
    private Long projectId;
    private Integer completenessScoreByGroup;      //完成任务规定的要求与水平评分
    private Integer correctnessScoreByGroup;       //回答问题的正确性评分
    private Integer qualityScoreByGroup;           //论文与实务的质量评分
    private Integer replyScoreByGroup;             //论文内容的答辩陈述评分
    private int scoresState = 0;              //答辩打分的状态,未打分、已打分、已提交

    public Scores() {
    }

    public Scores(Long projectId, Integer completenessScoreByGroup,
                  Integer correctnessScoreByGroup, Integer qualityScoreByGroup,
                  Integer replyScoreByGroup, int scoresState) {
        this.projectId = projectId;
        this.completenessScoreByGroup = completenessScoreByGroup;
        this.correctnessScoreByGroup = correctnessScoreByGroup;
        this.qualityScoreByGroup = qualityScoreByGroup;
        this.replyScoreByGroup = replyScoreByGroup;
        this.scoresState = scoresState;
    }

    @Generated(hash = 1407328210)
    public Scores(Long id, Long projectId, Integer completenessScoreByGroup,
            Integer correctnessScoreByGroup, Integer qualityScoreByGroup,
            Integer replyScoreByGroup, int scoresState) {
        this.id = id;
        this.projectId = projectId;
        this.completenessScoreByGroup = completenessScoreByGroup;
        this.correctnessScoreByGroup = correctnessScoreByGroup;
        this.qualityScoreByGroup = qualityScoreByGroup;
        this.replyScoreByGroup = replyScoreByGroup;
        this.scoresState = scoresState;
    }

    public Integer getCompletenessScoreByGroup() {
        return completenessScoreByGroup;
    }

    public void setCompletenessScoreByGroup(Integer completenessScoreByGroup) {
        this.completenessScoreByGroup = completenessScoreByGroup;
    }

    public Integer getCorrectnessScoreByGroup() {
        return correctnessScoreByGroup;
    }

    public void setCorrectnessScoreByGroup(Integer correctnessScoreByGroup) {
        this.correctnessScoreByGroup = correctnessScoreByGroup;
    }

    public Integer getQualityScoreByGroup() {
        return qualityScoreByGroup;
    }

    public void setQualityScoreByGroup(Integer qualityScoreByGroup) {
        this.qualityScoreByGroup = qualityScoreByGroup;
    }

    public Integer getReplyScoreByGroup() {
        return replyScoreByGroup;
    }

    public void setReplyScoreByGroup(Integer replyScoreByGroup) {
        this.replyScoreByGroup = replyScoreByGroup;
    }

    public int getScoresState() {
        return scoresState;
    }

    public void setScoresState(int scoresState) {
        this.scoresState = scoresState;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
