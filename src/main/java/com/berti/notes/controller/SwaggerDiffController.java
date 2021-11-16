package com.berti.notes.controller;

import com.berti.notes.model.Notes;
import com.deepoove.swagger.diff.SwaggerDiff;
import com.deepoove.swagger.diff.output.HtmlRender;
import com.deepoove.swagger.diff.output.MarkdownRender;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@RestController
public class SwaggerDiffController {


        @GetMapping("/api/swaggerDiff")
    @ResponseBody
    public void generateDiff() {
        try {
            File oldSpec = ResourceUtils.getFile("classpath:ref_old_swagger.json");
            File newSpec = ResourceUtils.getFile("classpath:ref_demo_swagger.json");
            SwaggerDiff diff = SwaggerDiff.compareV2(
                    oldSpec.getAbsolutePath(),
                    newSpec.getAbsolutePath()
            );

            // HTML
            String html = new HtmlRender(
                    "Changelog",
                    "http://deepoove.com/swagger-diff/stylesheets/demo.css"
            ).render(diff);

            FileWriter fw = new FileWriter("REFSpecChangeLog.html");
            fw.write(html);
            fw.close();

            // Markdown
            String render = new MarkdownRender().render(diff);
            FileWriter markdownWriter = new FileWriter("REFSpecChangeLogMarkdown.md");
            markdownWriter.write(render);
            markdownWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
